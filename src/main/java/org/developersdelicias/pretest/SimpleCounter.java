package org.developersdelicias.pretest;


public class SimpleCounter<T> {

    private static int count = 0;

    public SimpleCounter() {
        count++;
    }

    static int getCount() {
        return count;
    }
}
