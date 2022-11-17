package creatures;

import devices.Salleable;

import java.util.Scanner;

public class Pet extends Animal implements Salleable {
    public Pet(String specie){
        super(specie);
    }
    public void sell(Human seller, Human buyer, Double price){

        Scanner scan3 = new Scanner(System.in);

        String salaryDate;

        if(seller.pet != null)
        {
            if(buyer.salary >= price)
            {
                seller.pet = null;
                buyer.pet = this;

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
        System.out.println("Pet: " + this + "- ZOSTASŁ SPRZEDANY");
    }
}
