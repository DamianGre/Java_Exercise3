package devices;

import creatures.Human;

import java.util.Scanner;

public class Diesel extends Car{
    private static final  String DEFAULT_FUEL = "Diesel";

    public Diesel(String producer, String model, Double value, Integer yearOfproduction) {
        super(producer, model, value, yearOfproduction);
    }
    public void reFuel(){
        System.out.println("Diesel nalany");
    }

    public String toString(){
        return "Producer: " + this.producer + " Model: " + this.model + " Wartość:: " + this.value + " Production Year: " + this.yearOfProduction;    }


}
