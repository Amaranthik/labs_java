package ru.chepovetskiy.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Задание 1.3
/**
 * Аннотация для строкового представления.
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {
    enum Value { YES, NO }

    /**
     * Включать ли в вывод.
     */
    Value value() default Value.YES;
}