package ru.epam.javacore.lesson_7_collections_continue_map.homework.transportation.service;

import ru.epam.javacore.lesson_7_collections_continue_map.homework.common.business.service.CommonService;
import ru.epam.javacore.lesson_7_collections_continue_map.homework.transportation.domain.Transportation;

import java.util.List;

public interface TransportationService extends CommonService {
  void add(Transportation transportation);

  Transportation getById(Long id);

  List<Transportation> getAll();

}
