package ru.chepovetskiy.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.chepovetskiy.annotations.*;
import ru.chepovetskiy.domain.MyEntity;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для проверки аннотаций.
 */
class AnnotationsTest {

    // Задание 2.3
    @Test
    void testDefault() {
        assertTrue(MyEntity.class.isAnnotationPresent(Default.class));
        assertEquals(String.class, MyEntity.class.getAnnotation(Default.class).value());
    }

    // Задание 2.3 (параметризованный)
    @ParameterizedTest
    @ValueSource(classes = {MyEntity.class})
    void testDefaultParam(Class<?> clazz) {
        assertNotNull(clazz.getAnnotation(Default.class));
    }

    // Задание 2.5
    @Test
    void testCache() {
        Cache cache = MyEntity.class.getAnnotation(Cache.class);
        assertNotNull(cache);
        assertEquals(2, cache.value().length);
    }
}