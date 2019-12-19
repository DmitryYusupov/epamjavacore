package ru.epam.javacore.lesson_8_collections_continue_map.lesson.a_3_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A_3_Comparator_Demo {
    private static final class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("a"));
        cats.add(new Cat("z"));
        cats.add(new Cat("c"));
        cats.add(new Cat("y"));

        Collections.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for (Cat cot: cats){
            System.out.println(cot);
        }
    }

}
