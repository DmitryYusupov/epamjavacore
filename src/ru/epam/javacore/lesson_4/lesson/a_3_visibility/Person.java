package ru.epam.javacore.lesson_4.lesson.a_3_visibility;

public class Person {
    private String name;
    public String lastName;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
