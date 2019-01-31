package immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class ImmutableClass {

	private final int a;

	private final String b;

	private final Map<String, String> testMap;

	public ImmutableClass(int a, String b, Map<String, String> testMap) {
		this.a = a;
		this.b = b;
		// this.testMap=testMap;

		// do deep copy
		Map<String, String> tempMap = new HashMap<>();
		for (Entry<String, String> entry : testMap.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.testMap = tempMap;

	}

	public int getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	@SuppressWarnings("unchecked")
	public Map<String, String> getTestMap() {
		// here we are doing shallow cloning/copy
		// here it will work as both key and value of the map are String type which is
		// immutable
		return (Map<String, String>) ((HashMap<String, String>) testMap).clone();
		
		//should not return this way direct reference to the map object.
		//return testMap;
	}

	@Override
	public String toString() {
		return "ImmutableClass [a=" + a + ", b=" + b + ", testMap=" + testMap + "]";
	}

}
