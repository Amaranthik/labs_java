package ru.chepovetskiy.main;

import ru.chepovetskiy.geometry.Point;
import ru.chepovetskiy.geometry.Point3D;
import ru.chepovetskiy.people.Name;
import ru.chepovetskiy.people.Person;
import ru.chepovetskiy.animals.*;
import ru.chepovetskiy.items.Secret;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        try {
            Name n = new Name("Пушкин", "Александр", "Сергеевич");
            Person p = new Person(n, 167);
            System.out.println(p);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Задание 2");
        Secret s1 = new Secret("Алиса", "Я люблю Java");
        Secret s2 = new Secret(s1, "Боб");
        Secret s3 = new Secret(s2, "Ева");
        System.out.println(s3);

        System.out.println();
        System.out.println("Задания 3, 6, 8");
        Point p1 = new Point(10, 20);
        Point3D p3d = new Point3D(10, 20, 30);
        System.out.println(p1);
        System.out.println(p3d);
        System.out.println(p1.equals(p3d));

        System.out.println();
        System.out.println("Задания 4, 5");
        Bird sparrow = new Sparrow();
        Bird cuckoo = new Cuckoo();
        Bird parrot = new Parrot("Привет");

        sparrow.sing();
        cuckoo.sing();
        parrot.sing();

        Cat barsik = new Cat("Барсик");
        makeItMeow(barsik);

        System.out.println();
        System.out.println("Задание 7");
        String xStr = "2";
        String yStr = "5";
        double result = power(xStr, yStr);
        System.out.println(result);
    }

    public static void makeItMeow(Meowable m) {
        m.meow();
    }

    public static double power(String x, String y) {
        int base = parseInt(x);
        int exp = parseInt(y);
        return pow(base, exp);
    }
}