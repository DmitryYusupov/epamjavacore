package ru.epam.javacore.lesson_7_collections_continue_map.homework.cargo.repo;

import ru.epam.javacore.lesson_7_collections_continue_map.homework.cargo.domain.Cargo;
import ru.epam.javacore.lesson_7_collections_continue_map.homework.common.business.repo.CommonRepo;

import java.util.List;

public interface CargoRepo extends CommonRepo {

  void add(Cargo cargo);

  Cargo getById(long id);

  Cargo[] getByName(String name);

  List<Cargo> getAll();
}
