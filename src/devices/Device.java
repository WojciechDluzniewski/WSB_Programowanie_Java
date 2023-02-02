package devices;

import com.company.Selleable;

public abstract class Device implements Selleable {
    String model;
    String producer;
    Integer yearOfProduction;

    abstract void turnOn();

    @Override
    public String toString() {
        return model + " " + producer + " " + yearOfProduction;
    }



}
