package com.company;

public class Car {
    final String model;
    final String producer;
    Double horsePower;
    Integer yearOfProduction;
    Double value;

    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.value = value;
    }
}
