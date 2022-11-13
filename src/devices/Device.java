package devices;

public abstract class Device {
    final String producer;
    final String model;
    final Integer yearOfProduction;

    public Device(String producer, String model,Integer yearOfProduction){
        this.producer =producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void recharge(Integer precentage);
}
