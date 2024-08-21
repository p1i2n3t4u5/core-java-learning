package thread_interthread_comm2;

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

        while (i < 10) {
          synchronized (lock) {

            while (i % 3 != 0) {
              try {
                lock.wait();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
            
            System.out.println("t1 " + i);
            i++;
            lock.notifyAll();

          }
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {

      @Override
      public void run() {
        while (i < 10) {
          synchronized (lock) {
            while (i % 3 != 1) {
              try {
                lock.wait();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
            System.out.println("t2 " + i);
            i++;
            lock.notifyAll();
          }
        }
      }
    });
    
    Thread t3 = new Thread(new Runnable() {
      @Override
      public void run() {
        while (i < 10) {
          synchronized (lock) {
            while (i % 3 != 2) {
              try {
                lock.wait();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
            System.out.println("t3 " + i);
            i++;
            lock.notifyAll();
          }
        }
      }
    });

    t1.start();
    t2.start();
    t3.start();
  }

}
