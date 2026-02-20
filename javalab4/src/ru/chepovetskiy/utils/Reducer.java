package ru.chepovetskiy.utils;

public interface Reducer<T> {
    T reduce(T t1, T t2);
}