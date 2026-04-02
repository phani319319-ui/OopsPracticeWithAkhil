package org.example;

public class Generics2<T> {

    T[] obj=(T[]) new Object[10];
    int length=0;

    public void set(T v){
        obj[length++]=v;

    }


}
