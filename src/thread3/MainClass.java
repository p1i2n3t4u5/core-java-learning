package thread3;

public class MainClass {

	
	public static void main(String[] args) {
		
		final String resource1="x";
		final String resource2="y";
		
		new Thread(new Thread1(resource1, resource2)).start();
		new Thread(new Thread2(resource1, resource2)).start();
		
	}

}
