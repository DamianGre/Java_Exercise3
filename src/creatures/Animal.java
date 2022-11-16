package creatures;

import devices.Salleable;

public abstract class Animal implements Feedable, Salleable {
    private static final Double DEFAULT_DOG_WEIGHT = 7.0;
    private static final Double DEFAULT_BOAR_WEIGHT = 30.2;
    private static final Double DEFAULT_CAT_WEIGHT = 2.5;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEFAULT_COW_WEIGHT = 45.0;
    private static final  Double DEFAULT_SNAKE_WEIGHT = 1.0;

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
        if (this.isAlive == true) {
            this.weight += 0.5;
            System.out.println("Dzięki za żarcie");
        } else {
            System.out.println("Czy wszystko dobrze z głową?");
        }
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

    public void sell(creatures.Human seller, creatures.Human buyer, Double price){

    }

    public String toString() {
        return "Specie: " + this.specie + " " + "Name: " + this.name + " " + "Weight: " + this.weight + " " + "Is alive? " + this.isAlive;
    }


}
