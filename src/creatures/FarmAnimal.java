package creatures;

import devices.Salleable;

import java.util.Scanner;

public class FarmAnimal extends Animal implements Edible, Salleable {
    public FarmAnimal(String specie){
        super(specie);
    }
    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println("Mam nadzieję, że smakowało MORDERCO");
    }

    @Override
    public boolean isPoisoned() {
        if(this.specie == "snake") {
            return true;
        }
        else{
            return false;
        }
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
    public String toString() {
        return "Specie: " + this.specie + " " + "Name: " + this.name + " " + "Weight: " + this.weight + " " + "Is alive? " + this.isAlive;
    }


}
