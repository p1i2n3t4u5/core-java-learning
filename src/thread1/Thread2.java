package thread1;

public class Thread2 implements Runnable {

  @Override
  public void run() {
    while (MainClass.counter < MainClass.max) {
    synchronized (MainClass.lock) {
        if (MainClass.counter % 2 == 0) {
          try {
            sleep();
            MainClass.lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println(MainClass.counter + " T2");
        MainClass.counter++;
        sleep();
        MainClass.lock.notify();
      }
    }
  }

  private void sleep() {
    try {
    	Thread.sleep(100);
    } catch (InterruptedException e1) {
    	e1.printStackTrace();
    }
  }

}
