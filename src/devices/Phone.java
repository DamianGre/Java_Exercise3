package devices;

import creatures.Edible;

public class Phone extends Device {


    public Phone(String producer, String model, Integer yearOfProduction)
    {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void recharge(Integer precentage) {
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Naładowano");
    }

    public void sell(creatures.Human seller, creatures.Human buyer, Double price){

    };

    public String toString() {
        return "Producer: " + this.producer + " " + "Model: " + this.model;
    }
}