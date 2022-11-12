
public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        dog.name = "Szarik";
        dog.isAlive = true;

        System.out.println(dog.name);
        System.out.println(dog.weight);
        dog.feed();
        System.out.println(dog.weight);

        Human me = new Human();

        me.firstName = "Damian";
        me.pet = dog;
        dog.takeForAWalk();
        System.out.println(dog.weight);
        dog.takeForAWalk();
        dog.takeForAWalk();
        me.pet.feed();


        Car car1 = new Car("Peugeot","307",25000.00);
        Car car2 = new Car("Renault","Scenic",5000.00);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1);
        System.out.println(car2);

        Phone phone = new Phone("Samsung","A51");

        me.phone = phone;

        me.setCar(car1);
        me.setSalary();
        me.setSalary();
        me.setSalary();
        System.out.println(me.getSalary());
        me.setCar(car1);
        System.out.println(me.getCar());
        System.out.println(me.getSalary());
        me.setSalary();
        System.out.println(me.getSalary());

        System.out.println(new Car("Peugeot","307",25000.00).equals(new Car("Peugeot","307",25000.00)));
        System.out.println(car1.equals(car2));


        System.out.println(car1);
        System.out.println(dog);
        System.out.println(phone);
        System.out.println(me);





    }
}