package devices;

import creatures.Human;

public abstract class Device implements Salleable{
    final  public String producer;
    final  public String model;
    final public Integer yearOfProduction;

    public Double value;

    public Device(String producer, String model, Double value, Integer yearOfProduction){
        this.producer =producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value =value;
    }

    abstract void recharge(Integer precentage);
    abstract void turnOn();

    public String toString() {
        return "Producer: " + this.producer + " " + "Model: " + this.model + " " + "Year of production: " + this.yearOfProduction + " ";
    }
}
