package com.test.unmodifiableMapList;

import java.util.Map;

public class UnmodifiableMapExample2 {
    public static void main(String[] args) {
        // Create an unmodifiable Map using Map.of()
        Map<String, String> unmodifiableMap = Map.of(
            "key1", "value1",
            "key2", "value2",
            "key3", "value3"
        );

        System.out.println(unmodifiableMap);

        // This will throw UnsupportedOperationException
        // unmodifiableMap.put("key4", "value4"); // Uncomment to see the exception
    }
}
