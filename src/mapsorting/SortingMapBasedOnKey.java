package mapsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortingMapBasedOnKey {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("c", "supriya");
		map.put("e", "kadambini");
		map.put("a", "satya");
		map.put("b", "niranjan");

		map.forEach((k, v) -> {
			System.out.println("key:" + k + "  value:" + v);
		});

		System.out.println("------------------------after sorting ---------------------------");

		TreeMap<String, String> treeMap = new TreeMap<>(map);

		treeMap.forEach((k, v) -> {
			System.out.println("key:" + k + "  value:" + v);
		});

		System.out.println("------------------------sorting in reverse order ---------------------------");

		TreeMap<String, String> treeMapReverse = new TreeMap<>(Collections.reverseOrder());

		treeMapReverse.putAll(map);

		treeMapReverse.forEach((k, v) -> {
			System.out.println("key:" + k + "  value:" + v);
		});

		System.out.println(
				"------------------------sorting in revere order using java 8 stream ---------------------------");

		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("c", "supriya");
		map2.put("e", "kadambini");
		map2.put("a", "satya");
		map2.put("b", "niranjan");

		map2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEachOrdered((e) -> {
			System.out.println("Key:" + e.getKey() + "  " + e.getValue());
		});
		
		System.out.println(
        "------------------------sorting in revere order using java 8 stream by value ---------------------------");
		


    map2.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered((e) -> {
      System.out.println("Key:" + e.getKey() + "  " + e.getValue());
    });


		System.out.println(
				"------------------------sorting based on value or key using Collections.sort()---------------------------");
		Map<String, String> map3 = new HashMap<String, String>();
		map3.put("c", "supriya");
		map3.put("e", "kadambini");
		map3.put("a", "satya");
		map3.put("b", "niranjan");

		Set<Map.Entry<String, String>> set = map.entrySet();
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(set);

		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		list.stream().forEachOrdered(a -> System.out.println(a.getKey() + "   " + a.getValue()));

	}

}
