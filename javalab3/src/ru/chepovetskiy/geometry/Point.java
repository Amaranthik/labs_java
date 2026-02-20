package ru.chepovetskiy.geometry;

// Базовый класс Точка (для Задания 3.5)
public class Point implements Cloneable {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Задание 6.2: Полиморфное сравнение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    // Задание 8.4: Клонирование
    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}