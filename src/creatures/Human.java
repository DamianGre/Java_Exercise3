package creatures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import devices.*;


public class Human extends Animal {
    public String firstName;
    String lastName;
    public Animal pet;
    public Car [] garage;
    //public Car car;
    public Double salary = 0.0;
    public Phone phone;
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    public List<Double> salaryHistoryList = new ArrayList<Double>();
    public List<String> salaryDateList = new ArrayList<String>();

    public Human(Integer garageSize) {
        super("Homo sapiens");
        this.garage= new Car[garageSize];
    }

    public void getSalary() {

        for(int x=0; x < salaryDateList.size() || x < salaryHistoryList.size() ; x++) {
            if (this.salaryHistoryList.get(x) < 0) {
                System.out.println("W dniu: " + this.salaryDateList.get(x)
                        + ". Pobrano z konta: " + this.salaryHistoryList.get(x));
            } else {
                System.out.println("W dniu: " + this.salaryDateList.get(x)
                        + ". Kwota wynagrodzenia wyniosła: " + this.salaryHistoryList.get(x));
            }
        }

        System.out.print("Dzisiaj stan konta wynosi: " + this.salary);
        System.out.println(" ");


    }

    public void setSalary(){
        Double salary;
        String salaryDate;
        do{
            System.out.println("Podaj kwotę wypłaty");
            salary = scan.nextDouble();
            if(salary <= 0)
            {
                System.out.println("Podana kwota jest ujemna lub zerowa - wprowadź kwotę dodatnią.");
            }
            else{
                this.salary += salary;
                this.salaryHistoryList.add(salary);

                System.out.println("Podaj Datę przelewu");
                salaryDate = scan2.nextLine();
                this.salaryDateList.add(salaryDate);

                System.out.println("Dane zostały wysłane do systemu księgowe.");
                System.out.println("ZUS i US wiedzą o wypłacie więc nie ma sensu ukrywać dochodu.");
            }
        }while(salary <= 0);
    }

    public devices.Car getCar(int carIndex)
    {
        return this.garage[carIndex];
    }
    public void setCar(devices.Car car){
        String salaryDate;
        if(this.salary >= car.value){
            System.out.println("Udało się kupić auto " + car + " za gotówkę. Z konta zostanie pobrana kwota: "+ car.value);
            System.out.println("Podaj Datę przelewu za auto: ");
            salaryDate = scan2.nextLine();
            this.salaryDateList.add(salaryDate);

            this.salary -= car.value;
            this.car = car;
            double carCost = car.value * (-1);
            this.salaryHistoryList.add(carCost);
            }
        else if(this.salary >= car.value/12){
            System.out.println("Udało się kupić auto na raty");
            this.car = car;
        }
        else{
            System.out.println("Nie masz wystarczająco pineniedzy na zakup auta. Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

    public void sell(Human seller, Human buyer, Double price){
        System.out.println("YOU CAN'T SELL HUMANS");
    }

    public void sumCarsValue(){
        Double sumCarValue = 0.0;
        for(Car car: garage){
            sumCarValue += car.value;
        }
        System.out.println(sumCarValue);
    }

    public String toString(){
        return "First name: " + this.firstName + " Last name: " + this.lastName + " Animal: " + this.pet + " Car: " + this.car
                + " Phone: " + this.phone + " Salary: " + this.salary;
    }
}