package ru.chepovetskiy.animals;
import java.util.Random;

public class Parrot extends Bird {
    private final String text;

    public Parrot(String text) {
        this.text = text;
    }

    @Override
    public void sing() {
        int n = new Random().nextInt(text.length()) + 1; // от 1 до длины текста
        System.out.println(text.substring(0, n));
    }
}