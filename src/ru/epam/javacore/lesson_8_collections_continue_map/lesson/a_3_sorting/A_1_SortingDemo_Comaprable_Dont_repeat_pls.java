package ru.epam.javacore.lesson_8_collections_continue_map.lesson.a_3_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A_1_SortingDemo_Comaprable_Dont_repeat_pls {
    public static void main(String[] args) {

        a_1_demoSorting();
    }

    private static void a_1_demoSorting() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Wsdascsdv"));
        cities.add(new City("Xsdascsdv"));
        cities.add(new City("Ssdascsdv"));
        cities.add(new City("Asdascsdv"));
        cities.add(new City("Msdascsdv"));

        /*Collections.sort(cities);
        for (City city : cities) {
            System.out.println(city);
        } */

        for (City city : cities) {
            city.setOrder(City.Order.ASC);
        }
        Collections.sort(cities);
        for (City city : cities) {
            System.out.println(city);
        }

    }

    private static class City implements Comparable<City>{
        private String name;
        private Order order = Order.ASC;

        public enum Order{
            ASC, DESC
        }

        public City(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(City o) {
            int sign = Order.ASC.equals(this.order) ? 1 : -1;
            return sign * this.name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public void setOrder(Order order) {
            this.order = order;
        }
    }
}
