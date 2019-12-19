package ru.epam.javacore.lesson_7_collections_continue_map.homework.carrier.service;

import ru.epam.javacore.lesson_7_collections_continue_map.homework.carrier.domain.Carrier;
import ru.epam.javacore.lesson_7_collections_continue_map.homework.common.business.service.CommonService;

import java.util.List;

public interface CarrierService extends CommonService {
  void add(Carrier carrier);

  Carrier getById(Long id);

  List<Carrier> getByName(String name);

  List<Carrier> getAll();

}
