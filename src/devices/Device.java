package devices;

public abstract class Device {
    String model;
    String producer;
    Integer yearOfProduction;

    abstract void turnOn();

    @Override
    public String toString() {
        return model + " " + producer + " " + yearOfProduction;
    }

}
