package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        dog.weight = 10.3;

        System.out.println("Masz zwierzę, nazywa się: ");
        System.out.println(dog.name);
        System.out.println(dog.isAlive);
        System.out.println(dog.species);

        Animal cat = new Animal("european");
        cat.name = "Filemon";
        cat.weight = 3.2;

        System.out.println("Masz kota, nazywa się: ");
        System.out.println(cat.name);
        System.out.println(cat.isAlive);
        System.out.println(cat.species);

        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        System.out.println(cat.weight);
        //cat.feed();
        cat.takeForAWalk();

        Human me = new Human();
        me.pet = new Animal("felis");
        System.out.println(me.pet.species);
        //me.pet.feed();


        me.pet = dog;
        System.out.println(me.pet.species);

        Car ford = new Car("Mondeo", "Ford");
        me.car = ford;
        //ctrl + alt + l

        System.out.println(me.car.producer);


    }
}
