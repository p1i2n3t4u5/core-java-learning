package thread_interthread_comm;

public class ThreadTest {
  Object lock = new Object();
  int i = 0;

  public static void main(String[] args) {

    ThreadTest threadTest = new ThreadTest();
    threadTest.start();

  }

  private void start() {
    Thread t1 = new Thread(new Runnable() {

      @Override
      public void run() {

        while (i <= 10) {
          synchronized (lock) {

            if (i % 2 != 0) {
              try {
                System.out.println("t1 " + i);
                lock.wait();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
            i++;
            lock.notify();

          }
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {

      @Override
      public void run() {
        while (i <= 10) {
          synchronized (lock) {
            if (i % 2 != 1) {
              try {
                System.out.println("t2 " + i);
                lock.wait();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
            i++;
            lock.notify();
          }
        }
      }
    });
    
    

    t1.start();
    t2.start();
  }

}
