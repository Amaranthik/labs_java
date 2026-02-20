package ru.chepovetskiy.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Задание 1.2
/**
 * Аннотация для типа по умолчанию.
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {
    /**
     * Класс по умолчанию.
     */
    Class<?> value();
}