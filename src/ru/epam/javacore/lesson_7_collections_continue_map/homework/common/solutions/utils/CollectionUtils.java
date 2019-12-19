package ru.epam.javacore.lesson_7_collections_continue_map.homework.common.solutions.utils;

import java.util.Collection;

public final class CollectionUtils {

  private CollectionUtils() {

  }

  public static void printCollection(Collection<?> collection) {
    for (Object obj : collection) {
      System.out.println(obj.toString());
    }
  }

}
