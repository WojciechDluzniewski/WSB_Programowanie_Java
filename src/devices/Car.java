package devices;

import com.company.Human;

public class Car extends Device {

    Double horsePower;


    Double value;

    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.value = value;
    }

    public boolean equals(Car car) {
        return (this.model.equals(car.model) && this.producer.equals(car.producer) && this.value.equals(car.value));


    }

    @Override
    public void turnOn() {
        System.out.println("Samochód odpalił się");
    }

    public String toString() {
        return model + " " + producer;
    }


    public Double getValue() {
        return this.value;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() == null){
            System.out.println("Sprzedający nie posiada zsamochodu.");
            return;
        }
        if(buyer.cash < price ){
            System.out.println("Kupujący nie ma wystarczającej ilośći pieniędzy na zakup samochodu.");
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.setCar(seller.getCar());
        seller.setCar(null);

        System.out.println("Transkcja sprzedaży samochodu przebiegła pomyślnie");
    }
}
