package thread1;

public class MainClass {
	
	public static void main(String[] args) {
		
		StringBuffer buffer=new StringBuffer("lock");
		new Thread(new Thread1(buffer)).start();
		new Thread(new Thread2(buffer)).start();
	}

}
