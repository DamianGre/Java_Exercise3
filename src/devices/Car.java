package devices;

import creatures.Human;

import java.util.Scanner;

public class Car extends Device implements Salleable{

    public Double value;
    Double millage;
    String colour;
    Double width;
    Double height;
    Double lenght;

    public Car(String producer, String model, Double value, Integer yearOfproduction) {
        super(producer, model, yearOfproduction);
        this.value =value;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return this.model == car.model &&
                this.producer == car.producer &&
                this.value.equals(car.value);
    }




    public void sell(Human seller, Human buyer, Double price){

        Scanner scan3 = new Scanner(System.in);

        String salaryDate;

        if(seller.car != null)
        {
            if(buyer.salary >= price)
            {
                seller.car = null;
                buyer.car = this;

                buyer.salary -= price;
                seller.salary += price;

                System.out.println("Podaj Datę przelewu za towar: ");
                salaryDate = scan3.nextLine();
                seller.salaryDateList.add(salaryDate);
                buyer.salaryDateList.add(salaryDate);

                double goodsCost = price * (-1);
                buyer.salaryHistoryList.add(goodsCost);
                seller.salaryHistoryList.add(price);
            }
            else
            {
                System.out.println("Nie masz tyle pieniedzy");
            }
        }
        else {
            System.out.println("Nie posiadasz tego na sprzedaż.");
        }
        System.out.println("Car: " + this + "- ZOSTASŁ SPRZEDANY");
    }
    @Override
    public void recharge(Integer precentage) {
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Naładowano" + precentage);
    }
    @Override
    public void turnOn(){
        System.out.println("Car odpalony.");
    }
    public String toString(){
        return "Producer: " + this.producer + " Model: " + this.model + " Cena: " + this.value;
    }

}