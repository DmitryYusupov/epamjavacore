package ru.epam.javacore.lesson_7_collections_continue_map.homework.carrier.domain;


import ru.epam.javacore.lesson_7_collections_continue_map.homework.common.business.domain.BaseEntity;
import ru.epam.javacore.lesson_7_collections_continue_map.homework.transportation.domain.Transportation;

public class Carrier extends BaseEntity {

  private String name;
  private String address;
  private CarrierType carrierType;
  private Transportation[] transportations;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CarrierType getCarrierType() {
    return carrierType;
  }

  public void setCarrierType(CarrierType carrierType) {
    this.carrierType = carrierType;
  }

  public Transportation[] getTransportations() {
    return transportations;
  }

  public void setTransportations(Transportation[] transportations) {
    this.transportations = transportations;
  }

  @Override
  public String toString() {
    return "Carrier{" +
        "id='" + id + '\'' +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", carrierType=" + carrierType +
        '}';
  }
}
