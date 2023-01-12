package devices;

import creatures.Human;

import java.util.Scanner;

public class Electric extends Car{

    private static final  String DEFAULT_FUEL = "Electric";
    public Electric(String producer, String model, Double value, Integer yearOfproduction) {
        super(producer, model, value, yearOfproduction);
    }
    public void reFuel(){
        System.out.println("Naładowano Elektrycznością.");
    }

    public String toString(){
        return "Producer: " + this.producer + " Model: " + this.model + " Cena: " + this.value + " Production Year: " + this.yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
