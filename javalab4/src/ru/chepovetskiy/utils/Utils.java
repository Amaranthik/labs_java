package ru.chepovetskiy.utils;

import ru.chepovetskiy.generics.Box;
import ru.chepovetskiy.geometry.Point3D;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.function.Supplier;

public class Utils {

    // Задание 2.3
    public static void putPoint3D(Box<? super Point3D> box) {
        Point3D p = new Point3D(1, 2, 3);
        box.put(p);
    }

    // Задание 3.1
    public static <T, P> List<P> map(List<T> list, Transformer<T, P> transformer) {
        List<P> result = new ArrayList<>();
        for (T item : list) {
            result.add(transformer.apply(item));
        }
        return result;
    }

    // Задание 3.2
    public static <T> List<T> filter(List<T> list, Filter<T> filter) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (filter.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // Задание 3.3
    public static <T> T reduce(List<T> list, Reducer<T> reducer, T defaultValue) {
        if (list == null || list.isEmpty()) {
            return defaultValue;
        }
        T result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = reducer.reduce(result, list.get(i));
        }
        return result;
    }

    // Задание 3.4
    public static <T, P extends Collection<T>> P collect(List<T> list, Supplier<P> factory) {
        P collection = factory.get();
        collection.addAll(list);
        return collection;
    }
}