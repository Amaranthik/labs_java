package ru.chepovetskiy.generics;

public class Box<T> {
    private T item;

    public void put(T item) {
        if (this.item != null) {
            throw new IllegalStateException("Коробка уже полная!");
        }
        this.item = item;
    }

    public T get() {
        T temp = item;
        item = null;
        return temp;
    }

    public boolean isFull() {
        return item != null;
    }
}