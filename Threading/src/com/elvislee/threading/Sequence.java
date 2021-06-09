package com.elvislee.threading;

public class Sequence {
    private int value = 0;

    public int getNext() {
        // Thread safety: Add synchronized
        synchronized (this) {
            value++;
            return value;
        }
    }
}
