package devices;

import creatures.Edible;
import creatures.Human;

import java.util.Scanner;

public class Phone extends Device implements Salleable{


    public Phone(String producer, String model, Integer yearOfProduction)
    {
        super(producer, model, yearOfProduction);
    }



    public void sell(Human seller, Human buyer, Double price){

        Scanner scan3 = new Scanner(System.in);

        String salaryDate;

        if(seller.phone != null)
        {
            if(buyer.salary >= price)
            {
                seller.phone = null;
                buyer.phone = this;

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
        System.out.println("Phone: " + this + "- ZOSTASŁ SPRZEDANY");
    }
    @Override
    public void recharge(Integer precentage) {
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Naładowano" + precentage);
    }
    @Override
    public void turnOn(){
        System.out.println("Phone włączony");
    }

    public String toString() {
        return "Producer: " + this.producer + " " + "Model: " + this.model;
    }
}