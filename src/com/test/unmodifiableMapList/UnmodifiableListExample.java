package com.test.unmodifiableMapList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class UnmodifiableListExample {
    public static void main(String[] args) {
        // Create a modifiable list
        List<String> modifiableList = new ArrayList<>();
        modifiableList.add("item1");
        modifiableList.add("item2");
        modifiableList.add("item3");

        // Create an unmodifiable list
        List<String> unmodifiableList = Collections.unmodifiableList(modifiableList);

        System.out.println(unmodifiableList);

        // Attempting to modify the list will throw UnsupportedOperationException
        // unmodifiableList.add("item4"); // Uncomment to see the exception
    }
}

