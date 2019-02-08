package map;

import java.util.HashMap;
import java.util.Map;

public class RaceConditionNotHappening {

	public static void main(String[] args) throws InterruptedException {
		Map<String, String> favoriteFoods = new HashMap<>();
		Thread t1 = new Thread(() -> {
			favoriteFoods.put("Alice", "avocado");
			favoriteFoods.put("Bob", "banana");
		});
		Thread t2 = new Thread(() -> {
			favoriteFoods.put("Alice", "aloysia");
			favoriteFoods.put("Carl", "candy");
		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println(favoriteFoods);
	}

}
