package devices;

import creatures.Human;

public abstract class Device implements Salleable{
    final String producer;
    final String model;
    final Integer yearOfProduction;

    public Device(String producer, String model,Integer yearOfProduction){
        this.producer =producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void recharge(Integer precentage);
    abstract void turnOn();

    public String toString() {
        return "Producer: " + this.producer + " " + "Model: " + this.model + " " + "Year of production: " + this.yearOfProduction + " ";
    }
}
