package org.exam.exercise1.services;

public class LoopServices {


    public int largeNumber() {
        int i;
        for (i = 10; i < 100; i++) {
            if ((i / 10) % 10 > i % 10) {
                System.out.println(i);
            }
        }
        return i;
    }

}