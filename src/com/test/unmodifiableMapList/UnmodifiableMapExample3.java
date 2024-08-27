package com.test.unmodifiableMapList;

import static java.util.Map.entry;

import java.util.Map;

public class UnmodifiableMapExample3 {
    public static void main(String[] args) {
        // Create an unmodifiable Map using Map.ofEntries()
        Map<String, String> unmodifiableMap = Map.ofEntries(
            entry("key1", "value1"),
            entry("key2", "value2"),
            entry("key3", "value3")
        );

        System.out.println(unmodifiableMap);

        // This will throw UnsupportedOperationException
        // unmodifiableMap.put("key4", "value4"); // Uncomment to see the exception
    }
}

