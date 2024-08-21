package thread1;

public class MainClass {
  static Integer max = 10;
  static Object lock = new Object();
  public static Integer counter = 0;

  public static void main(String[] args) {
    MainClass mainClass = new MainClass();
    mainClass.start();
  }

  private void start() {
    new Thread(new Thread1()).start();
    new Thread(new Thread2()).start();
  }

}
