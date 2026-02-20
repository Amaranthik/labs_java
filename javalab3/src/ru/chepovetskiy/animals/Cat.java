package ru.chepovetskiy.animals;

// Задание 5.4: Кот реализует интерфейс
public class Cat implements Meowable {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}