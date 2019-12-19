package ru.epam.javacore.lesson_8_collections_continue_map.lesson.a_1_map_continue;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class A_1_DemoHashMap {

    public static void main(String[] args) {
        //a_1_demoFillMapWithData();
        //   a_2_demoFillMapWithData();
        //  a_3_demo_without_override_equals_and_hashcode();
        //a_4_demo_without_override_equals();
        //a_5_demo_without_override_hashcode();
        //a_6_demo_with_equals_and_hashCode();
        a_7_demo_with_equals_and_hashCode2();
    }


    private static void a_1_demoFillMapWithData() {
        Map<String, String> map = new HashMap<>();
        map.put("1_mjgjkg", "one");
        map.put("2", "two");

        Map<String, String> subMap = new HashMap<>();
        subMap.put("3", "three");
        subMap.put("4", "four");

        map.putAll(subMap);
        printMap(map);
    }

    private static void a_2_demoFillMapWithData() {
        Map<String, String> subMap = new HashMap<>();
        subMap.put("1_mjgjkg", "one");
        subMap.put("2", "two");

        Map<String, String> map = new HashMap<>(subMap);
        map.put("3", "three");
        map.put("4", "four");

        printMap(map);
    }

    private static void printMap(Map<?, ?> map) {
        System.out.println("---first-try------");
        for (Object key : map.keySet()) {
            System.out.println("key " + key + "; " + map.get(key));
        }

        System.out.println("---second try------");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println("key " + entry.getKey() + "; " + entry.getValue());
        }
    }

    private static class Country {
        private String name;

        public Country(String name) {
            this.name = name;
        }
    }

    private static void a_3_demo_without_override_equals_and_hashcode() {
        Map<Country, String> map = new HashMap<>();
        map.put(new Country("Russia"), "Russia");
        map.put(new Country("Belarus"), "Belarus");

        String russia = map.get(new Country("Russia"));
        System.out.println(russia);
    }

    private static class CountryWithHashCode {
        private String name;

        public CountryWithHashCode(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    private static void a_4_demo_without_override_equals() {
        Map<CountryWithHashCode, String> map = new HashMap<>();

        map.put(new CountryWithHashCode("Russia"), "Russia");
        map.put(new CountryWithHashCode("Russia"), "Russia");
        map.put(new CountryWithHashCode("Belarus"), "Belarus");

        String russia = map.get(new CountryWithHashCode("Russia"));
        System.out.println(russia);
    }

    private static class CountryWithEquals {
        private String name;

        public CountryWithEquals(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CountryWithEquals that = (CountryWithEquals) o;
            return Objects.equals(name, that.name);
        }


    }

    private static void a_5_demo_without_override_hashcode() {
        Map<CountryWithEquals, String> map = new HashMap<>();

        map.put(new CountryWithEquals("Russia"), "Russia");
        map.put(new CountryWithEquals("Russia"), "Russia");
        map.put(new CountryWithEquals("Belarus"), "Belarus");

        String russia = map.get(new CountryWithEquals("Russia"));
        System.out.println(russia);
    }

    private static class CountryWithEqualsAndHashCode {
        private String name;

        public CountryWithEqualsAndHashCode(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CountryWithEqualsAndHashCode that = (CountryWithEqualsAndHashCode) o;
            return Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name);
        }
    }

    private static void a_6_demo_with_equals_and_hashCode() {
        Map<CountryWithEqualsAndHashCode, String> map = new HashMap<>();
        CountryWithEqualsAndHashCode russia1 = new CountryWithEqualsAndHashCode("Russia");
        map.put(russia1, "Russia");

        CountryWithEqualsAndHashCode russia2 = new CountryWithEqualsAndHashCode("Russia");
        map.put(russia2, "Russia");
        map.put(new CountryWithEqualsAndHashCode("Belarus"), "Belarus");

        String russia = map.get(new CountryWithEqualsAndHashCode("Russia"));
        System.out.println(russia);
    }


    private static class CountryWithEqualsAndHashCode2 {
        private String name;

        public CountryWithEqualsAndHashCode2(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CountryWithEqualsAndHashCode2 that = (CountryWithEqualsAndHashCode2) o;
            return Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {

            return 3;
        }
    }

    private static void a_7_demo_with_equals_and_hashCode2() {
        Map<CountryWithEqualsAndHashCode2, String> map = new HashMap<>();

        CountryWithEqualsAndHashCode2 russia2 = new CountryWithEqualsAndHashCode2("Russia");
        map.put(russia2, "Russia");
        map.put(new CountryWithEqualsAndHashCode2("Belarus"), "Belarus");
        russia2.name = "ANY";

        String russia = map.get(new CountryWithEqualsAndHashCode2("Russia"));
        System.out.println(russia);
    }


    private  static class Pair {
        private final String s;
        private final String s2;

        public Pair(String s, String s2) {
            this.s = s;
            this.s2 = s2;
        }

        public String getS() {
            return s;
        }

        public String getS2() {
            return s2;
        }
    }
}
