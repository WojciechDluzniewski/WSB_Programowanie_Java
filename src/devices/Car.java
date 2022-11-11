package devices;

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

    public boolean equals(Car car) {
        return (this.model.equals(car.model) && this.producer.equals(car.producer) && this.value.equals(car.value));


    }

    public String toString(){
        return model + " " + producer;
    }

    public Double getValue(){
        return this.value;
    }
}
