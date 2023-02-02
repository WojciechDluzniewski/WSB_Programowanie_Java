package com.company;

public class Animal implements Selleable {
    String species;
    String name;
    Double weight;
    Boolean isAlive;

    Animal(String species) {
        this.isAlive = true;
        this.species = species;
    }

    void feed() {
        if (this.isAlive) {
            this.weight += 0.5;
            System.out.println("dzięki za żarcie");
        } else {
            System.out.println("Co robisz, przecież to padlina, idioto");
        }
    }

    void takeForAWalk() {
        if (this.isAlive) {

            this.weight -= 0.5;
            System.out.println("Teraz jestem fit");

            if (this.weight <= 0) {
                this.isAlive = false;
                System.out.println("Zwierzę zdechło z głodu");
            }

        } else {
            System.out.println("Policja została wezwana");
        }
    }

    public String toString(){
        return this.species + " " + this.name;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet == null){
            System.out.println("Sprzedający nie posiada zwierzęcia.");
            return;
        }
        if(buyer.cash < price ){
            System.out.println("Kupujący nie ma wystarczającej ilośći pieniędzy na zakup: " + this.name);
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.pet = seller.pet;
        seller.pet = null;

        System.out.println("Transkcja sprzedaży zwierzęcia przebiegła pomyślnie");


    }
}

