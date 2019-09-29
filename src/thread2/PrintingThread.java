package thread2;

public class PrintingThread implements Runnable {

	public int PRINT_NUMBERS_UPTO = 10;
	static int number = 1;
	int remainder;
	static Object lock = new Object();

	public PrintingThread(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (number < PRINT_NUMBERS_UPTO - 1) {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() +"  got the lock)");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				while (number % 3 != remainder) { // wait for numbers other than remainder
					try {
						System.out.println(Thread.currentThread().getName() +" before wait()");
						lock.wait();
						System.out.println(Thread.currentThread().getName() +" after wait()");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				System.out.println(Thread.currentThread().getName() +" before notify()");
				lock.notifyAll();
				System.out.println(Thread.currentThread().getName() +" after notify()");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}

	}

}
