import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import creatures.Human;
import devices.Electric;
import devices.Diesel;
import devices.LPG;
import devices.Phone;

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



        Human me = new Human(9);
        me.firstName = "damian";
        Human human2 = new Human(9);
        human2.firstName = "AGNIESZKA";

        me.salary = 5000000.0;
        human2.salary = 50000.0;

        me.setCar(car1,0);
        me.getAllCarsInGarage();

        car1.sell(me, human2, 1.0);

        System.out.println("-------------------");
        me.getAllCarsInGarage();
        System.out.println("+++++++++++++++++++++++");
        human2.getAllCarsInGarage();
        System.out.println("SSSSSSSSSSSSSSSSSSSS");
        me.getSalary();
        human2.getSalary();

        /* human2.getSalary();
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