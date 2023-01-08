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
        Phone nokia = new Phone("Nokia","5510",1990);

        List<String> appNames = new ArrayList<>();
        appNames.add("FB");
        appNames.add("INSTAGRAM");
        appNames.add("MESSENGER");

        nokia.installAPP(appNames);
        nokia.installAPP("snake");
        nokia.installAPP("Tweeter", "4.17");
        nokia.installAPP("mbank", "1.11", "http://michniewiczKrul.pl");



        Pet dog = new Pet("dog");

        dog.name = "Szarik";
        dog.isAlive = true;

        System.out.println(dog.name);
        System.out.println(dog.weight);
        dog.feed();
        System.out.println(dog.weight);

        Human me = new Human();
        Human human =new Human();

        me.firstName = "Damian";
        me.pet = dog;
        dog.takeForAWalk();
        System.out.println(dog.weight);
        me.pet.feed(5.0);
        System.out.println(dog.weight);
        dog.takeForAWalk();
        dog.takeForAWalk();
        me.pet.feed();
        System.out.println(dog.weight);


        Diesel car1 = new Diesel("Peugeot","307",25000.00,1900);
        LPG car2 = new LPG("Renault","Scenic",5000.00,1990);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1);
        System.out.println(car2);

        Phone phone = new Phone("Samsung","A51",1990);

        me.phone = phone;

        me.setCar(car1);
        me.setSalary();
        me.setSalary();
        me.setSalary();
        me.getSalary();
        me.setCar(car1);
        me.getCar();
        me.getSalary();
        me.setSalary();
        me.getSalary();

        System.out.println(new Electric("Peugeot","307",25000.00,1990).equals(new Electric("Peugeot","307",25000.00,1990)));


        System.out.println(car1);
        System.out.println(dog);
        System.out.println(phone);
        System.out.println(me);


        human.setSalary();



        System.out.println(me.pet);
        System.out.println("asdasdsasa");
        System.out.println(human.pet);
        System.out.println("asdasdsasa");

        dog.sell(me, human, 50.0);

        System.out.println(me.pet);
        System.out.println("asdasdsasa");
        System.out.println(human.pet);
        System.out.println("asdasdsasa");

        human.setSalary();

        System.out.println(me.phone);
        System.out.println("asdasdsasa");
        System.out.println(human.phone);

        phone.sell(me, human, 50.0);

        System.out.println("++++++++++++++");

        System.out.println(me.phone);
        System.out.println("asdasdsasa");
        System.out.println(human.phone);

        human.sell(me, human, 50.0);

        human.getSalary();
        me.getSalary();








    }
}