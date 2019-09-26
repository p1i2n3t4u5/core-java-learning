package map;

import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException {
		
		KeyObject mykey= new KeyObject(1);
		String myvalue="v";

		WeakHashMap<KeyObject, String> weakHashMap = new WeakHashMap();
		
		weakHashMap.put(mykey, myvalue);
		mykey=null;
		System.out.println(weakHashMap);
		System.gc();
		Thread.sleep(4000);
		System.out.println(weakHashMap);
	}

}
