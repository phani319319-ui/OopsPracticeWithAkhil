package org.example;



public class List1<T> {

    T[] obj = (T[]) new Object[10];
    int count = 0;

    public void add(T n) {
        obj[count++] = n;
    }

    public T get(int x) {
        if (x < count)
            return obj[x];
        else {
            throw new IllegalArgumentException("no value assigned");
        }

    }
}
