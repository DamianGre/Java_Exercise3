package creatures;

import devices.Salleable;

import java.util.Scanner;

public abstract class Animal implements Feedable, Salleable {
    private static final Double DEFAULT_DOG_WEIGHT = 7.0;
    private static final Double DEFAULT_BOAR_WEIGHT = 30.2;
    private static final Double DEFAULT_CAT_WEIGHT = 2.5;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEFAULT_COW_WEIGHT = 45.0;
    private static final  Double DEFAULT_SNAKE_WEIGHT = 1.0;
    private static final  Double DEFAULT_FOOD_WEIGHT = 1.0;

    final String specie;
    public String name;
    public Boolean isAlive;
    public Double weight;


    public Animal(String specie) {
        this.specie = specie;
        this.isAlive = true;

        switch (specie) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "boar":
                this.weight = DEFAULT_BOAR_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "cow":
                this.weight = DEFAULT_COW_WEIGHT;
                break;
            case "snake":
                this.weight = DEFAULT_SNAKE_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
                break;
        }
    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }
    public void feed(Double foodWeight) {
        if (this.isAlive == true) {
            this.weight += foodWeight;
            System.out.println("Dzięki za żarcie");
        } else {
            System.out.println("Czy wszystko dobrze z głową?");
        }
    }

    public void takeForAWalk() {
        if (this.isAlive == true) {
            this.weight -= 1.0;
            if (this.weight <= 0) {
                System.out.println("Zwierze nie żyje!");
                this.isAlive = false;
            } else {
                System.out.println("Dzięki za spacer");
            }
        } else {
            System.out.println("DZOWNIĘ NA POLICJĘ!");
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
