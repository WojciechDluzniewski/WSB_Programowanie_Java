package com.company;

public class Animal {
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


}

