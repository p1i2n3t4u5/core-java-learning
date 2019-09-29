package thread1;

public class Thread1 implements Runnable {
	StringBuffer buffer;
	public Thread1(StringBuffer buffer) {
		this.buffer=buffer;
	}

	@Override
	public void run() {

		int i = 0;
		while (i <= 5) {

			synchronized (buffer) {
				System.out.println("Thread1---"+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				buffer.notifyAll();
				try {
					buffer.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			i++;

		}

	}

}
