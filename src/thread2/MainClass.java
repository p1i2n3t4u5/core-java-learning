package thread2;

public class MainClass {

	
	public static void main(String[] args) throws InterruptedException {
		PrintingThread runnable1 = new PrintingThread(1);
		PrintingThread runnable2 = new PrintingThread(2);
		PrintingThread runnable3 = new PrintingThread(0);

		Thread t1 = new Thread(runnable1, "T1");
		Thread t2 = new Thread(runnable2, "T2");
		Thread t3 = new Thread(runnable3, "T3");
		
		
		t2.start();
		Thread.sleep(100);
		t3.start();
		Thread.sleep(100);
		t1.start();
	
	}

}
