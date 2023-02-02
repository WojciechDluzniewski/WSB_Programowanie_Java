package com.company;
import devices.Car;
import devices.Phone;

public class Main {

    public Main() {
    }

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
        me.firstName = "Wojciech";
        me.lastName = "Dluzniewski";
        me.pet = new Animal("felis");
        System.out.println(me.pet.species);
        //me.pet.feed();

        Human sister = new Human();
        sister.firstName = "Karolina";
        sister.lastName = "Dluzniewska";
        sister.cash = 100000.0;


        me.pet = dog;
        System.out.println(me.pet.species);

        Car ford = new Car("Mondeo", "Ford", 5000.0);
        Car toyota = new Car("CHR", "Toyota", 2999.0);
        me.setSalary(200.0);
//        me.car = ford;
//        //ctrl + alt + l
//        System.out.println(me.car.producer);


        Double salaryCheck = me.getSalary();

        me.setCar(ford);

        me.setSalary(3000.0);
        salaryCheck = me.getSalary();

        me.setCar(ford);

        me.setCar(toyota);

        Car ford2 = new Car("Mondeo", "Ford", 5000.0);

        if(ford == ford2){
            System.out.println("Te Fordy są identyczne!");
        }
        else{
            System.out.println("Te Fordy różnią się od siebie.");
        }

        if(ford.equals(ford2)){
            System.out.println("Te Fordy są identyczne!");
        }
        else{
            System.out.println("Te Fordy różnią się od siebie.");
        }

        System.out.println(ford);
        System.out.println(ford2);

        System.out.println(me);
        System.out.println(dog);

        ford2.turnOn();

        Phone phone = new Phone("11 Pro", "Apple", "4");
        me.phone = phone;


        System.out.println(me.cash);
        System.out.println(sister.cash);

//        me.pet.sell(me, sister, 9999.0);
//        System.out.println(me.cash);
//        System.out.println(sister.cash);
//
//
//        me.getCar().sell(me, sister, 24000.0);
//        System.out.println(me.cash);
//        System.out.println(sister.cash);
//
//        me.phone.sell(me, sister, 2783.0);
//        System.out.println(me.cash);
//        System.out.println(sister.cash);



        sister.cash = 0;

        me.pet.sell(me, sister, 9999.0);
        System.out.println(me.cash);
        System.out.println(sister.cash);


        me.getCar().sell(me, sister, 24000.0);
        System.out.println(me.cash);
        System.out.println(sister.cash);

        me.phone.sell(me, sister, 2783.0);
        System.out.println(me.cash);
        System.out.println(sister.cash);

        }

    }

