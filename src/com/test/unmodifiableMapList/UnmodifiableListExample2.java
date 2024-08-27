package com.test.unmodifiableMapList;

import java.util.List;

public class UnmodifiableListExample2 {
    public static void main(String[] args) {
        // Create an unmodifiable list using List.of()
        List<String> unmodifiableList = List.of("item1", "item2", "item3");

        System.out.println(unmodifiableList);

        // This will throw UnsupportedOperationException
        // unmodifiableList.add("item4"); // Uncomment to see the exception
    }
}


