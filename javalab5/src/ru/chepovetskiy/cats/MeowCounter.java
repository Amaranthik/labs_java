package ru.chepovetskiy.cats;

// Задание 2
public class MeowCounter implements Meowable {
    private Meowable cat;
    private int count;

    public MeowCounter(Meowable cat) {
        this.cat = cat;
        this.count = 0;
    }

    @Override
    public void meow() {
        cat.meow();
        count++;
    }

    public int getCount() {
        return count;
    }
}