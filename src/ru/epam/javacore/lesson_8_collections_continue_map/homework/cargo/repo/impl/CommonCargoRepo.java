package ru.epam.javacore.lesson_8_collections_continue_map.homework.cargo.repo.impl;

import ru.epam.javacore.lesson_8_collections_continue_map.homework.cargo.domain.Cargo;
import ru.epam.javacore.lesson_8_collections_continue_map.homework.cargo.domain.CargoField;
import ru.epam.javacore.lesson_8_collections_continue_map.homework.cargo.repo.CargoRepo;
import ru.epam.javacore.lesson_8_collections_continue_map.homework.cargo.search.CargoSearchCondition;
import ru.epam.javacore.lesson_8_collections_continue_map.homework.common.solutions.comparator.SimpleComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class CommonCargoRepo implements CargoRepo {

  private static final List<CargoField> FIELDS_ORDER_TO_SORT_CARGOS = Arrays
      .asList(CargoField.NAME, CargoField.WEIGHT);
  private static final Comparator<Cargo> CARGO_NAME_COMPARATOR = new Comparator<Cargo>() {
    @Override
    public int compare(Cargo o1, Cargo o2) {
      return SimpleComparator.STRING_COMPARATOR.compare(o1.getName(), o2.getName());
    }
  };

  private static final Comparator<Cargo> CARGO_WEIGHT_COMPARATOR = new Comparator<Cargo>() {
    @Override
    public int compare(Cargo o1, Cargo o2) {
      return Integer.compare(o1.getWeight(), o2.getWeight());
    }
  };

  protected Comparator<Cargo> createCargoComparator(CargoSearchCondition searchCondition) {
    Comparator<Cargo> result = null;

    if (searchCondition.needSorting()) {

      for (CargoField cargoField : FIELDS_ORDER_TO_SORT_CARGOS) {
        if (searchCondition.shouldSortByField(cargoField)) {

          if (result == null) {
            result = getComparatorForCargoField(cargoField);
          } else {
            result.thenComparing(getComparatorForCargoField(cargoField));
          }
        }
      }
    }

    return result;
  }


  private Comparator<Cargo> getComparatorForCargoField(CargoField cargoField) {
    switch (cargoField) {

      case NAME: {
        return CARGO_NAME_COMPARATOR;
      }
      case WEIGHT: {
        return CARGO_WEIGHT_COMPARATOR;
      }
    }

    return null;
  }


}
