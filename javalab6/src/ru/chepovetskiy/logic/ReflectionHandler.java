package ru.chepovetskiy.logic;

import ru.chepovetskiy.annotations.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Класс-обработчик аннотаций через Reflection API.
 */
public class ReflectionHandler {

    // Задание 1.1
    /**
     * Вызывает методы с аннотацией @Invoke.
     */
    public static void processInvoke(Object obj) {
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    method.invoke(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Задание 1.2
    /**
     * Выводит значения @Default.
     */
    public static void processDefault(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Default.class)) {
            System.out.println("Class Default: " + clazz.getAnnotation(Default.class).value().getName());
        }
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Default.class)) {
                System.out.println("Field " + field.getName() + " Default: " + field.getAnnotation(Default.class).value().getName());
            }
        }
    }

    // Задание 1.3
    /**
     * Формирует строку с учетом @ToString.
     */
    public static String processToString(Object obj) {
        Class<?> clazz = obj.getClass();
        StringBuilder sb = new StringBuilder(clazz.getSimpleName() + "{");
        boolean classYes = clazz.isAnnotationPresent(ToString.class) && clazz.getAnnotation(ToString.class).value() == ToString.Value.YES;

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            boolean include = classYes;

            if (field.isAnnotationPresent(ToString.class)) {
                include = field.getAnnotation(ToString.class).value() == ToString.Value.YES;
            }

            if (include) {
                try {
                    sb.append(field.getName()).append("=").append(field.get(obj)).append(", ");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        if (sb.length() > clazz.getSimpleName().length() + 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    // Задание 1.4
    /**
     * Выводит классы из @Validate.
     */
    public static void processValidate(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Validate.class)) {
            System.out.println("Validate: " + Arrays.toString(clazz.getAnnotation(Validate.class).value()));
        }
    }

    // Задание 1.5
    /**
     * Выводит свойства @Two.
     */
    public static void processTwo(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Two.class)) {
            Two two = clazz.getAnnotation(Two.class);
            System.out.println("Two: " + two.first() + ", " + two.second());
        }
    }

    // Задание 1.6
    /**
     * Выводит кэш из @Cache.
     */
    public static void processCache(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Cache.class)) {
            String[] arr = clazz.getAnnotation(Cache.class).value();
            System.out.println(arr.length == 0 ? "Cache empty" : "Cache: " + Arrays.toString(arr));
        }
    }
}