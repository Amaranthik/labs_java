package ru.chepovetskiy.utils;

public interface Filter<T> {
    boolean test(T t);
}