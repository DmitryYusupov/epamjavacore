package ru.epam.javacore.lesson_18_19_20_java_8.lessons.lesson_1.a_2_functional_interface;

@FunctionalInterface
public interface Extractor {
    void extract();

    default void extract2(){

    }


}
