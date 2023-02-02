package com.company;

import devices.Car;
import devices.Phone;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    private Car car;
    Integer yearOfBirth;
    private Double salary = 0.0;

    public double cash;

    public Phone phone;

    public Double getSalary() {
        System.out.println(java.time.LocalDate.now());
        System.out.println(this.salary);
        return this.salary;
    }



    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            return;
        }
        System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
        System.out.println("Proszę udać do Pani Hanny z działu kadr w celu odebranie aneksu do umowy.");
        System.out.println("Nie ukrywaj tego przed ZUSem oras US. I tak już wiedzą i dojadą Cię podatkami.");
        this.salary = newSalary;
    }

    public Car getCar(){
        return this.car;
    }

    public void setCar(Car newCar){
        if(newCar == null){
            this.car = null;
            return;
        }

        if(this.salary > newCar.getValue()){
            System.out.println("Udało się kupić auto za gotówkę.");
            this.car = newCar;
        }
        else if(this.salary > (newCar.getValue())/12){
            System.out.println("Udało się kupić samochód na kredyt.");
            this.car = newCar;
        }
        else{
            System.out.println("Znajdź sobie lepszą pracę, albo postaraj się o podwyżkę i nie zawracaj poważnym ludziom gitary.");
        }
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
