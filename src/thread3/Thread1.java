package thread3;

public class Thread1 implements Runnable {
	
	private final String resource1;
	private final String resource2;
	
	public Thread1(final String resource1,final String resource2) {
		this.resource1=resource1;
		this.resource2=resource2;
	}

	@Override
	public void run() {
		synchronized (resource2) {
			
			System.out.println("Thread1  got resource2");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (resource1) {
				System.out.println("Thread1  got  resource1 and resource2");
			}
			
		}
		
	}

}
