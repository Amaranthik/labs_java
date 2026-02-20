package ru.chepovetskiy.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Задание 1.4
/**
 * Аннотация для валидации типов.
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {
    /**
     * Разрешенные классы.
     */
    Class<?>[] value();
}