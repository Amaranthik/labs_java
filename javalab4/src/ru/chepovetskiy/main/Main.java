package ru.chepovetskiy.main;

import ru.chepovetskiy.generics.Box;
import ru.chepovetskiy.generics.Storage;
import ru.chepovetskiy.geometry.Point;
import ru.chepovetskiy.geometry.Point3D;
import ru.chepovetskiy.utils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        Box<Integer> intBox = new Box<>();
        intBox.put(3);
        System.out.println(intBox.get());

        System.out.println();
        System.out.println("Задание 1.2");
        Storage<Integer> nullNumStore = new Storage<>(null);
        System.out.println(nullNumStore.getValue(0));

        Storage<Integer> numStore = new Storage<>(99);
        System.out.println(numStore.getValue(-1));

        Storage<String> nullStrStore = new Storage<>(null);
        System.out.println(nullStrStore.getValue("default"));

        Storage<String> strStore = new Storage<>("hello");
        System.out.println(strStore.getValue("hello world"));

        System.out.println();
        System.out.println("Задание 2.3");
        Box<Point3D> p3dBox = new Box<>();
        Utils.putPoint3D(p3dBox);
        System.out.println(p3dBox.get());

        Box<Point> pBox = new Box<>();
        Utils.putPoint3D(pBox);
        System.out.println(pBox.get());

        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        List<int[]> arrays = Arrays.asList(new int[]{1, 2, 3}, new int[]{-1, -5}, new int[]{10});

        System.out.println();
        System.out.println("Задание 3.1");
        List<Integer> lengths = Utils.map(strings, str -> str.length());
        System.out.println(lengths);

        List<Integer> abs = Utils.map(numbers, n -> Math.abs(n));
        System.out.println(abs);

        List<Integer> maxs = Utils.map(arrays, arr -> {
            int max = Integer.MIN_VALUE;
            for (int i : arr) {
                if (i > max) max = i;
            }
            return max;
        });
        System.out.println(maxs);

        System.out.println();
        System.out.println("Задание 3.2");
        List<String> shortStrs = Utils.filter(strings, s -> s.length() < 3);
        System.out.println(shortStrs);

        List<Integer> negs = Utils.filter(numbers, n -> n < 0);
        System.out.println(negs);

        System.out.println();
        System.out.println("Задание 3.3");
        String concat = "";
        for (String s : strings) {
            concat += s;
        }
        System.out.println(concat);

        Integer sum = Utils.reduce(numbers, (n1, n2) -> n1 + n2, 0);
        System.out.println(sum);

        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3), Arrays.asList(4, 5, 6));
        List<Integer> sizes = Utils.map(listOfLists, list -> list.size());
        Integer totalElements = Utils.reduce(sizes, (n1, n2) -> n1 + n2, 0);
        System.out.println(totalElements);

        System.out.println();
        System.out.println("Задание 3.4");
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (Integer n : numbers) {
            if (n > 0) pos.add(n);
            else neg.add(n);
        }
        System.out.println(pos);
        System.out.println(neg);
    }
}