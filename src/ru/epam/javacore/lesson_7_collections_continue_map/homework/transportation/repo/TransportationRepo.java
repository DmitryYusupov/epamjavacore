package ru.epam.javacore.lesson_7_collections_continue_map.homework.transportation.repo;

import ru.epam.javacore.lesson_7_collections_continue_map.homework.common.business.repo.CommonRepo;
import ru.epam.javacore.lesson_7_collections_continue_map.homework.transportation.domain.Transportation;

import java.util.List;

public interface TransportationRepo extends CommonRepo {
    void add(Transportation transportation);

    Transportation getById(long id);

    List<Transportation> getAll();
}
