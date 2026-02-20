import task1.Name;
import task2.Person;
import task3.City;
import task5.Cat;

public class Main {
    public static void main(String[] args) {
        // Задание 1.3
        System.out.println("Задание 1");
        Name n1 = new Name(null, "Клеопатра", null);
        Name n2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name n3 = new Name("Маяковский", "Владимир", null);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");

        // Задача 2.2
        Person p1 = new Person(n1, 152);
        Person p2 = new Person(n2, 167);
        Person p3 = new Person(n3, 189);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("---");

        // Задача 2.3
        Name nameIvan = new Name("Чудов", "Иван", null);
        Person ivan = new Person(nameIvan, 180);

        Name namePetr = new Name(null, "Петр", null);
        Person petr = new Person(namePetr, 175, ivan);

        Name nameBoris = new Name(null, "Борис", null);
        Person boris = new Person(nameBoris, 170, petr);

        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(boris);
        System.out.println();

        // Задание 3.3
        System.out.println("Задание 3");

        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");

        a.addPath(b, 5);
        a.addPath(f, 1);
        a.addPath(d, 6);

        b.addPath(a, 5);
        b.addPath(f, 1);
        b.addPath(c, 3);

        c.addPath(b, 3);
        c.addPath(d, 4);

        d.addPath(c, 4);
        d.addPath(a, 6);
        d.addPath(e, 2);

        e.addPath(f, 2);

        f.addPath(b, 1);
        f.addPath(e, 2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // Задание 4
        System.out.println();
        System.out.println("Задание 4");

        // Задача 4.5
        task4.Name nCleo = new task4.Name("Клеопатра");
        task4.Name nPushkin = new task4.Name("Александр", "Пушкин", "Сергеевич");
        task4.Name nMayak = new task4.Name("Владимир", "Маяковский");
        task4.Name nChris = new task4.Name("Христофор", "Бонифатьевич");

        System.out.println(nCleo);
        System.out.println(nPushkin);
        System.out.println(nMayak);
        System.out.println(nChris);
        System.out.println();

        // Задача 4.6
        task4.Person lev = new task4.Person("Лев", 170);

        task4.Name nameSergey = new task4.Name("Сергей", "Пушкин");
        task4.Person sergey = new task4.Person(nameSergey, 168, lev);

        task4.Person alex = new task4.Person("Александр", 167, sergey);

        System.out.println(lev);
        System.out.println(sergey);
        System.out.println(alex);

        // Задание 5.2
        System.out.println();
        System.out.println("Задание 5");

        Cat barsik = new Cat("Барсик");
        System.out.println(barsik);
        barsik.meow();
        barsik.meow(3);
    }
}