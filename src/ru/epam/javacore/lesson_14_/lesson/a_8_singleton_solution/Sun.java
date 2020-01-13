package ru.epam.javacore.lesson_14_.lesson.a_8_singleton_solution;

import java.io.Serializable;

public final class Sun implements Serializable {
    public static final Sun INSTANCE = new Sun("Sun star");

    private String name;

    private Sun(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
