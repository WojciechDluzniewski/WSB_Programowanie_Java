package devices;

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

    public String toString(){
        return model + " " + producer;
    }

    public Double getValue(){
        return this.value;
    }
}
