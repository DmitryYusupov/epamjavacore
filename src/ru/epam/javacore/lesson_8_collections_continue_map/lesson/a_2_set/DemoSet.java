package ru.epam.javacore.lesson_8_collections_continue_map.lesson.a_2_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(
                Arrays.asList("a", "b", "c")
        );

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("asas");
        set2.add("44asas");
        set2.add("as7878as");
    }

}
