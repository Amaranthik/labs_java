package ru.chepovetskiy.main;

import ru.chepovetskiy.domain.MyEntity;
import ru.chepovetskiy.logic.ReflectionHandler;

/**
 * Точка входа в программу.
 */
public class Main {
    public static void main(String[] args) {
        MyEntity entity = new MyEntity(1, "Demo");

        System.out.println("Задание 1.1 (@Invoke)");
        ReflectionHandler.processInvoke(entity);

        System.out.println("\nЗадание 1.2 (@Default)");
        ReflectionHandler.processDefault(MyEntity.class);

        System.out.println("\nЗадание 1.3 (@ToString)");
        System.out.println(ReflectionHandler.processToString(entity));

        System.out.println("\nЗадание 1.4 (@Validate)");
        ReflectionHandler.processValidate(MyEntity.class);

        System.out.println("\nЗадание 1.5 (@Two)");
        ReflectionHandler.processTwo(MyEntity.class);

        System.out.println("\nЗадание 1.6 (@Cache)");
        ReflectionHandler.processCache(MyEntity.class);
    }
}