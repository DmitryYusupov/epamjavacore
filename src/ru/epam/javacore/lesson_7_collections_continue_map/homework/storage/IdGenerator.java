package ru.epam.javacore.lesson_7_collections_continue_map.homework.storage;

public final class IdGenerator {

    private IdGenerator() {
    }

    private static Long id = 0L;

    public static Long generateId() {
        return ++id;
    }
}
