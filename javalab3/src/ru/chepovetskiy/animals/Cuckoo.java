package ru.chepovetskiy.animals;
import java.util.Random;

public class Cuckoo extends Bird {
    @Override
    public void sing() {
        int times = new Random().nextInt(10) + 1; // от 1 до 10
        for (int i = 0; i < times; i++) {
            System.out.println("ку-ку");
        }
    }
}