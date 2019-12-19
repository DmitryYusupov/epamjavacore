package ru.epam.javacore.lesson_7_collections_continue_map.homework.cargo.repo.impl;

import static ru.epam.javacore.lesson_7_collections_continue_map.homework.storage.Storage.cargoCollection;

import ru.epam.javacore.lesson_7_collections_continue_map.homework.cargo.domain.Cargo;
import ru.epam.javacore.lesson_7_collections_continue_map.homework.cargo.repo.CargoRepo;
import ru.epam.javacore.lesson_7_collections_continue_map.homework.storage.IdGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CargoCollectionRepoImpl implements CargoRepo {

  @Override
  public void add(Cargo carrier) {
    carrier.setId(IdGenerator.generateId());
    cargoCollection.add(carrier);
  }

  @Override
  public Cargo getById(long id) {
    for (Cargo carrier : cargoCollection) {
      if (Long.valueOf(id).equals(carrier.getId())) {
        return carrier;
      }
    }

    return null;
  }

  @Override
  public Cargo[] getByName(String name) {
    List<Cargo> result = new ArrayList<>();

    for (Cargo carrier : cargoCollection) {
      if (Objects.equals(carrier.getName(), name)) {
        result.add(carrier);
      }
    }

    return result.toArray(new Cargo[0]);
  }

  @Override
  public List<Cargo> getAll() {
    return cargoCollection;
  }

  @Override
  public boolean deleteById(long id) {
    Iterator<Cargo> iter = cargoCollection.iterator();

    boolean removed = false;
    while (iter.hasNext()) {
      if (Long.valueOf(id).equals(iter.next().getId())) {
        iter.remove();
        removed = true;
        break;
      }
    }

    return removed;
  }
}
