package ru.chepovetskiy.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Задание 1.5
/**
 * Аннотация с двумя параметрами.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Two {
    /**
     * Строковое свойство.
     */
    String first();

    /**
     * Числовое свойство.
     */
    int second();
}