package devices;
import devices.Car;

import creatures.Human;

import java.util.Scanner;

public class LPG extends Car{
    private static final  String DEFAULT_FUEL = "LPG";

    public LPG(String producer, String model, Double value, Integer yearOfproduction) {
        super(producer, model, value, yearOfproduction);
    }
    public void reFuel(){
        System.out.println("Gaz z rosji dodany");
    }

    public String toString(){
        return "Producer: " + this.producer + " Model: " + this.model + " Cena: " + this.value + " Production Year: " + this.yearOfProduction;    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
