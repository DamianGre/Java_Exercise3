package devices;

import creatures.Human;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Car extends Device implements Salleable, Comparable<Car>{

    Double millage;
    String colour;
    Double width;
    Double height;
    Double lenght;
    Integer transactionCounter = 0;
    public List<Human> ownerHistoryList = new ArrayList<Human>();
    public List<Transactions> transactionsHistoryList = new ArrayList<Transactions>();


    public Car(String producer, String model, Double value, Integer yearOfProduction) {
        super(producer, model, value, yearOfProduction);
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if(!seller.hasACar(this)){
            throw new Exception("Sprzedawca nie ma tego auta.");
        }
        if(!buyer.canHaveMoreCars()){
            throw new Exception("Kupujący nie ma więcej miejsca w garażu.");
        }
        if(!buyer.hasLessMoneyThen(price)){
            throw new Exception("Kupujący nie ma dość pieniędzy.");
        }
        if(!seller.isLastOwnerOfCar(this, seller)){
            throw new Exception("Sprzedający nie jest ostatnim właścicielem pojazdu.");
        }

        seller.removeCar(this);
        buyer.addCar(this);
        seller.addMoney(price);
        seller.salaryDateList.add("Transakcja sprzedaż/kupno auta");
        seller.salaryHistoryList.add(price);
        buyer.collectMoney(price);
        buyer.salaryDateList.add("Transakcja sprzedaż/kupno auta");
        buyer.salaryHistoryList.add(price * -1);
        this.ownerHistoryList.add(buyer);
        this.transactionsHistoryList.add(new Transactions(seller, buyer, price));
        this.transactionCounter++;
        System.out.println("Transakcja się powiodła. To auto: " + this + " zostało sprzedane do: " + buyer);
    }
    /* public void sell(Human seller, Human buyer, Double price, Integer carIndex){
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
    } */

    public int getYearOfProduction(){
        return this.yearOfProduction;
    }
    public void ownerChecker(){
        if(this.ownerHistoryList.size() == 0){
            System.out.println("Auto do tej pory nie posiadało żadnego właściciela.");
        }else{
            System.out.println("Auto posiadało juz właścicieli.");
        }
    }

    public void hasSellerSoldToBuyer(Human seller, Human buyer){
        for(int i = 0; i < transactionsHistoryList.size(); i++){
            if(seller == transactionsHistoryList.get(i).seller && buyer == transactionsHistoryList.get(i).buyer){
                System.out.println("Sprzedawca: " + seller + " sprzedał to auto do:" + buyer);
                return;
            }
        }
            System.out.println("NIE BYŁO TAKIEJ TRANSAKCJI!");
    }

    public void numberOfTransactionsWithCar(){
        System.out.println("Auto brało udział w takiej ilości transakcji sprzedaży: " + transactionCounter);
    }

    public void getPresentOwner() throws Exception{
        if(this.ownerHistoryList.size() == 0){
            throw new Exception("Auto do tej pory nie posiadało żadnego właściciela.");
        }
        System.out.println("Właścicielem pojazdu jest: " + this.ownerHistoryList.get(this.ownerHistoryList.size()-1));
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
    public int compareTo(Car otherCar){
        return this.yearOfProduction.compareTo(otherCar.yearOfProduction);
    }

    @Override
    public void turnOn(){
        System.out.println("Car odpalony.");
    }
    public String toString(){
        return "Producer: " + this.producer + " Model: " + this.model + " Wartość: " + this.value + " Production Year: " + this.yearOfProduction;
    }
}