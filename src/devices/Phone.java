package devices;

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
}
