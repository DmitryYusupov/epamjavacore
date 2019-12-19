package ru.epam.javacore.lesson_8_collections_continue_map.lesson.a_4_treemap_treeset;

import java.util.*;

public class Demo {

    private static class Animal {
        private int age;

        public Animal(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {

        Map<Animal, Integer> map = new TreeMap<>(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                //Integer.valueOf(o1.age).compareTo(o2.age);
                return Integer.compare(o1.age, o2.age);
            }
        });
        map.put(new Animal(44), 44);
        map.put(new Animal(2), 2);
        map.put(new Animal(30), 30);

        map.forEach((k, v) -> System.out.println(k + " " + v));

        Set<String> set = new TreeSet<>();
        set.add("Z");
        set.add("Y");
        set.add("X");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
