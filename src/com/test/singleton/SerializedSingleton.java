package com.test.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final SerializedSingleton instance = new SerializedSingleton();

    private SerializedSingleton() {}

    public static SerializedSingleton getInstance() {
        return instance;
    }

    // This method ensures that during deserialization, the singleton instance is maintained.
    protected Object readResolve() {
        return instance;
    }
}
