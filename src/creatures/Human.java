package creatures;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Comparator;
import devices.*;


public class Human extends Animal {
    public final static Integer DEFAULT_GARAGE_SIZE = 3;
    private final static String SPECIE_OF_HUMAN = "Homo Sapiens.";
    public String firstName;
    String lastName;
    public Animal pet;
    public Car [] garage; // miejsca parkingowe są ponumerowane od 0
    public Double salary = 0.0;
    public Phone phone;
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    public List<Double> salaryHistoryList = new ArrayList<Double>();
    public List<String> salaryDateList = new ArrayList<String>();

    public Human() {
        super(SPECIE_OF_HUMAN);
        this.garage= new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        super(SPECIE_OF_HUMAN);
        this.garage= new Car[garageSize];
    }

    public void getSalary() {
        for(int x=0; x < salaryDateList.size() || x < salaryHistoryList.size() ; x++) {
            if (this.salaryHistoryList.get(x) < 0) {
                System.out.println("W dniu: " + this.salaryDateList.get(x)
                        + ". Pobrano z konta: " + this.firstName + ", kwotę: " + this.salaryHistoryList.get(x));
            } else {
                System.out.println("W dniu: " + this.salaryDateList.get(x)
                        + ". Kwota zasilenia konta dla: " + this.firstName + ", wyniosła: " + this.salaryHistoryList.get(x));
            }
        }
        System.out.print("Dzisiaj stan konta osoby: "+ this.firstName + ", wynosi: " + this.salary);
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

    public Car getCar(Integer carIndex)throws Exception    {
        if(carIndex >= garage.length || carIndex < 0){
            throw new Exception("zły index.");
        }
        System.out.println("Osoba: "+ this.firstName + ". Posiada na tym miejscu takie auto: " + this.garage[carIndex]);
        return this.garage[carIndex];
    }
    public void getAllCarsInGarage()
    {
        Integer carCounter = 0;
        for(Car cars: garage)
        {
            if(cars != null){
                System.out.println("Osoba: "+ this.firstName + ". Posiada takie auto: " +cars);
                carCounter++;
            }
            continue;
        }
        if(carCounter == 0){
            System.out.println("Garaż osoby: " + this.firstName + " jest pusty.");
        }
    }
   public void setCar(Car car, Integer carIndex){
       try{
           String salaryDate;
        if(this.salary >= car.value) {
            if (this.garage[carIndex] == null) {
                System.out.println("Udało się kupić auto " + car + " za gotówkę. Z konta zostanie pobrana kwota: " + car.value);
                System.out.println("Podaj Datę przelewu za auto: ");
                salaryDate = scan2.nextLine();
                this.salaryDateList.add(salaryDate);

                this.salary -= car.value;
                this.garage[carIndex] = car;
                double carCost = car.value * (-1);
                this.salaryHistoryList.add(carCost);
            }else{
                System.out.println("Na tym miejscu stoi juz auto.");
            }
        }else if (this.salary >= car.value / 12) {
            if (this.garage[carIndex] == null) {
                System.out.println("Udało się kupić auto NA RATY! " + car + " za gotówkę. Z konta zostanie pobrana kwota: " + car.value);
                System.out.println("Podaj Datę przelewu za auto: ");
                salaryDate = scan2.nextLine();
                this.salaryDateList.add(salaryDate);

                this.salary -= car.value;
                this.garage[carIndex] = car;
                double carCost = car.value * (-1);
                this.salaryHistoryList.add(carCost);
                }
                else{
                System.out.println("Na tym miejscu stoi juz auto. Wybierz inne miejsce");
                }
            } else {
                System.out.println("Nie masz wystarczająco pineniedzy na zakup auta. Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
            }

    }catch (Exception e) {
           System.out.println("Zły indeks lub coś innego");
       }
    }

    public void sell(Human seller, Human buyer, Double price){
        System.out.println("YOU CAN'T SELL HUMANS");
    }

    public void sumCarsValue(){
        Double sumCarValue = 0.0;
        for(Car car: garage){
            if(car == null)
            {
                continue;
            }
            sumCarValue += car.value;
        }
        System.out.println("Suma wszystkich aut wynosi: " + sumCarValue);
    }
    public void sortGarageByYearOfProd(){
            Arrays.sort(this.garage, Comparator.nullsFirst(Comparator.comparingInt(Car::getYearOfProduction)));
            System.out.println("Garaż posortowany");
    }

    public void sortCarsByValue(){
        CarByValueComparator comparator = new CarByValueComparator();
        Arrays.sort(this.garage, comparator);
    }




    public void carsSortingByAgeToViewInNewArrayWithOutChangingThierPlaceInGarage(){  // SORTUJE DO NOWE TABLICE A GARAŻ JEST NIE POSORTOWANY
       Integer arrayWithYearsOfDevice[] = new Integer[this.garage.length];

        System.out.println("Oto samochody posortowane po roku produkcji.");

        for(Integer ix = 0; ix < this.garage.length;ix++)
        {
            if(this.garage[ix] == null){
                arrayWithYearsOfDevice[ix] = -1;
                continue;
            }
            arrayWithYearsOfDevice[ix] = this.garage[ix].yearOfProduction;
        }
        Arrays.sort(arrayWithYearsOfDevice);
        for(Integer i = 0; i < arrayWithYearsOfDevice.length; i++){
            for(Integer ix = 0; ix < garage.length; ix++){
                if(garage[ix] == null){
                    continue;
                }
                if(arrayWithYearsOfDevice[i] == garage[ix].yearOfProduction){
                    System.out.println(garage[ix]);
                }
            }
        }
    }

    public boolean hasACar(Car car) {
        Boolean hasACar = false;

        for(Integer i = 0; i < this.garage.length; i++){
            if(car.equals(this.garage[i])){
                hasACar = true;
            }
        }
        return hasACar;
    }
    public boolean canHaveMoreCars() {
        Boolean haveFreeSpaceForCar = false;

        for(Integer i = 0; i < this.garage.length; i++){
            if(this.garage[i] == null){
                haveFreeSpaceForCar = true;
            }
        }
        return haveFreeSpaceForCar;
    }
    public boolean hasLessMoneyThen(Double price) {
        Boolean hasMoneyToBuy = false;
        if (price >= this.salary) {
            hasMoneyToBuy = true;
        }
        return hasMoneyToBuy;
    }
    public void removeCar(Car car){
        for(Integer i = 0; i < this.garage.length; i++){
            if(car.equals(this.garage[i])){
                this.garage[i] = null;
            }
        }
    }
    public void addCar(Car car){
        for(Integer i = 0; i < this.garage.length; i++){
            if(this.garage[i] == null){
                this.garage[i] = car;
                return;
            }
        }
    }
    public void addMoney(Double price){
        this.salary += price;
    }
    public void collectMoney(Double price){
        this.salary -= price;
    }


    public String toString(){
        return "First name: " + this.firstName + " Last name: " + this.lastName + " Animal: " + this.pet
                + " Phone: " + this.phone + " Salary: " + this.salary;
    }
}