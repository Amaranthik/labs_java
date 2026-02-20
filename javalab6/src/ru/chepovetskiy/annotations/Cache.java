package ru.chepovetskiy.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Задание 1.6
/**
 * Аннотация для кэширования.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {
    /**
     * Список областей кэша.
     */
    String[] value() default {};
}