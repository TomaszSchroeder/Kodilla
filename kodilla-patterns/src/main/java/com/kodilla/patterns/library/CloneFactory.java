package com.kodilla.patterns.library;

public class CloneFactory<T> implements Cloneable {

    @Override
    public T clone() throws CloneNotSupportedException {
        return (T)super.clone();
    }
}
