package ru.chepovetskiy.domain;

import ru.chepovetskiy.annotations.*;

// Используем все аннотации для демонстрации
/**
 * Класс-сущность для проверки аннотаций.
 */
@Default(String.class)
@ToString
@Validate({Integer.class, String.class})
@Two(first = "Test", second = 100)
@Cache({"memory", "disk"})
public class MyEntity {

    @ToString(ToString.Value.NO)
    @Default(Integer.class)
    private int id;

    @ToString
    private String title;

    /**
     * Конструктор сущности.
     */
    public MyEntity(int id, String title) {
        this.id = id;
        this.title = title;
    }

    /**
     * Метод с автовызовом.
     */
    @Invoke
    public void actionOne() {
        System.out.println("actionOne вызван!");
    }

    /**
     * Обычный метод.
     */
    public void actionTwo() {
        System.out.println("actionTwo вызван.");
    }
}