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
        LPG car7 = new LPG("NADMIAR","NADMIAR",99999.00,0);



        Human me = new Human(9);

        me.salary = 5000000.0;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1);
        System.out.println(car2);

        System.out.println("++++++++++");
        me.setCar(car1,0);
        System.out.println("++++++++++");
        me.setCar(car2,1);
        System.out.println("++++++++++");
        me.setCar(car3,2);
        System.out.println("++++++++++");
        me.setCar(car4,3);
        System.out.println("++++++++++");
        me.setCar(car5,4);
        System.out.println("++++++++++");
        me.setCar(car6,5);
        System.out.println("++++++++++");
        me.getAllCarsInGarage();
        System.out.println("!!!!!!!!");
        System.out.println(me.garage.length);
        System.out.println("!!!!!!!! TERAZ SORT BĘDZIE");

        me.carsSortingByAge();
        System.out.println("__________________________");
        me.setCar(car7,10);
        System.out.println("++++++++++");
        me.carsSortingByAge();
        System.out.println("__________________________");
        me.setCar(car7,6);
        System.out.println("++++++++++");
        me.carsSortingByAge();

    }
}