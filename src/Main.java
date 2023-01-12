import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import creatures.Human;
import devices.Electric;
import devices.Diesel;
import devices.LPG;
import devices.Phone;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


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

        me.salary = 50000000.0;
        human2.salary = 5.0;

        me.setCar(car7,0);


        System.out.println(me.getCar(0));
        System.out.println(human2.getCar(0));
        System.out.println("damian " + me.salary);
        System.out.println("AGA " + human2.salary);

        car7.sell(me,human2,2.0, 1);

        System.out.println(me.getCar(0));
        System.out.println(human2.getCar(0));
        System.out.println("--------------------");
        System.out.println("damian " + me.salary);
        System.out.println("AGA " + human2.salary);
        System.out.println("--------------------");

        me.setCar(car1,1);
        me.setCar(car2,2);
        me.setCar(car3,3);
        me.setCar(car4,4);
        me.getAllCarsInGarage();
        System.out.println("--------------------");
        me.carsSortingByAge();

    }
}