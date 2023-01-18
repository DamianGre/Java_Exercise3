package devices;

import creatures.Human;

import java.util.Scanner;

public abstract class Car extends Device implements Salleable{

    Double millage;
    String colour;
    Double width;
    Double height;
    Double lenght;

    public Car(String producer, String model, Double value, Integer yearOfProduction) {
        super(producer, model, value, yearOfProduction);
    }
    public void sell(Human seller, Human buyer, Double price, Integer carIndex){

        Scanner scan3 = new Scanner(System.in);

        String salaryDate;
        if(seller.garage != null && seller.garage[carIndex] != null)
        {
            System.out.println("\nSprzedajemy! "+ this + ". Za cenę " + price + "\n");
            if(buyer.salary >= price){
                for(int i = 0; i < buyer.garage.length; i++)
                {
                    if(buyer.garage[i] == null)
                    {
                        buyer.garage[i] = seller.garage[carIndex];
                        break;
                    }
                    else{
                        System.out.println("Brak miejsca w garażu.");
                        return;
                    }
                }
                seller.garage[carIndex] = null;

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
                return;
            }
        }else{
            System.out.println("Nie posiadasz tego na sprzedaż.");
            return;
        }
        System.out.println("Car: " + this + ". - ZOSTAŁ SPRZEDANY");
    }
    @Override
    public void recharge(Integer precentage) {
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Naładowano" + precentage);
    }
    public abstract void reFuel();

    @Override
    public void turnOn(){
        System.out.println("Car odpalony.");
    }
    public String toString(){
        return "Producer: " + this.producer + " Model: " + this.model + " Wartość: " + this.value + " Production Year: " + this.yearOfProduction;
    }
}