package devices;

import com.company.Human;

public class Phone extends Device {
    String model;
    String producer;
    String ram;


    public Phone(String model, String producer, String ram) {
        this.model = model;
        this.producer = producer;
        this.ram = ram;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon włączył się");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.phone == null){
            System.out.println("Sprzedający nie posiada telefonu na sprzedaż.");
            return;
        }
        if(buyer.cash < price ){
            System.out.println("Kupujący nie ma wystarczającej ilośći pieniędzy na zakup telefonu.");
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.phone = seller.phone;
        seller.phone = null;

        System.out.println("Transkcja sprzedaży telefonu przebiegła pomyślnie");
    }

}
