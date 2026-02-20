package ru.chepovetskiy.utils;

public interface Transformer<T, P> {
    P apply(T t);
}