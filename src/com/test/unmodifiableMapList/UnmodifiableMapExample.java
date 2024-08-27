package com.test.unmodifiableMapList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMapExample {
    public static void main(String[] args) {
        // Create a modifiable Map
        Map<String, String> modifiableMap = new HashMap<>();
        modifiableMap.put("key1", "value1");
        modifiableMap.put("key2", "value2");

        // Create an unmodifiable Map
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(modifiableMap);

        // Attempting to modify the map will throw UnsupportedOperationException
        System.out.println(unmodifiableMap);

        // This will throw an exception
        // unmodifiableMap.put("key3", "value3"); // Uncomment to see the exception
    }
}

