package ru.chepovetskiy.people;

// Задание 1.8
public class Person {
    private Name name;
    private int height;
    private final Person father;

    public Person(Name name, int height) {
        this(name, height, null);
    }

    public Person(Name name, int height, Person father) {
        this.name = name;
        setHeight(height);
        this.father = father;
    }

    public Name getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0 || height > 500) {
            throw new IllegalArgumentException("Рост должен быть больше 0 и не больше 500!");
        }
        this.height = height;
    }

    public Person getFather() {
        return father;
    }

    @Override
    public String toString() {
        String res = name.toString() + ", рост: " + height;
        if (father != null) {
            res += " (Отец: " + father.name + ")";
        }
        return res;
    }
}