import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import creatures.Human;
import devices.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {


        Diesel car1 = new Diesel("Peugeot","307",25000.00,99999);
        LPG car2 = new LPG("Renault","Scenic",5000.00,1000);
        LPG car3 = new LPG("asd","asd",3.00,250);
        LPG car4 = new LPG("asd","asd",3.00,155);
        LPG car5 = new LPG("asd","asd",3.00,1);
        LPG car6 = new LPG("asd","asd",3.00,2500);
        LPG car7 = new LPG("NADMIAR","NADMIAR",1.00,0);

        Application app1 = new Application("GAGLE", "1.0",1.0);
        Application app2 = new Application("MIKROSAWD", "2.0",2.0);
        Application app3 = new Application("IJOES", "3.0",3.0);
        Application app4 = new Application("LIMUKS", "4.0",4.0);
        Application app5 = new Application("FREE", "6.0",0.0);
        Application app6 = new Application("ASD", "126.0",1111.0);


        Phone phone = new Phone("Nokia", "3310", 500.0, 1995);

        Human me = new Human(9);
        me.firstName = "damian";
        Human human2 = new Human(9);
        human2.firstName = "AGNIESZKA";

        me.salary = 5000000.0;
        human2.salary = 5000000.0;

        me.phone = phone;

        phone.installApp(me, app1);
        phone.installApp(me, app2);
        phone.installApp(me, app3);
        phone.installApp(me, app4);
        phone.installApp(me, app5);

        System.out.println("111111111 ++++++++++");
        phone.installedAppChecker(app1);
        phone.installedAppChecker(app6);
        System.out.println("22222222 ++++++++++++");
        phone.installedAppCheckerByName("GAGLE");
        phone.installedAppCheckerByName("ASDASDASD");
        System.out.println("3333333 ++++++++++++");
        phone.freeAppPrinter();
        System.out.println("4444444 ++++++++++++");
        System.out.println("Suma wartości zainstalowanych aplikacji wynosi: " + phone.sumOfApps());
        System.out.println("55555 ++++++++++++");
        phone.allAppsNamesPrinter();
        System.out.println("66666 ++++++++++++");
        phone.allAppsPricePrinter();



        /* car1.ownerChecker();

        me.setCar(car1,0);
        car1.ownerChecker();
        me.getAllCarsInGarage();


        car1.sell(me, human2, 1.0);

        System.out.println("-------------------");
        me.getAllCarsInGarage();
        System.out.println("+++++++++++++++++++++++");
        human2.getAllCarsInGarage();
        System.out.println("SSSSSSSSSSSSSSSSSSSS");
        me.getSalary();
        human2.getSalary();
        System.out.println("AAAAAAAAAA");
        car1.getPresentOwner();
        System.out.println("'''''''''''''''''''");
        car1.hasSellerSoldToBuyer(me, human2);
        car1.hasSellerSoldToBuyer(human2, me);
        car1.numberOfTransactionsWithCar();
        car3.numberOfTransactionsWithCar();

        human2.getSalary();
        me.getSalary();

        me.setCar(car1, 0);
        human2.getAllCarsInGarage();
        human2.getSalary();
        me.getAllCarsInGarage();
        me.getSalary();

        car1.sell(me, human2, 25000.0, 0);

        System.out.println("++++++++++");
        human2.getAllCarsInGarage();
        human2.getSalary();
        me.getAllCarsInGarage();
        me.getSalary(); */
    }
}