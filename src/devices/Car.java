package devices;

public class Car extends Device{

    public Double value;
    Double millage;
    String colour;
    Double width;
    Double height;
    Double lenght;

    public Car(String producer, String model, Double value, Integer yearOfproduction) {
        super(producer, model, yearOfproduction);
        this.value =value;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return this.model == car.model &&
                this.producer == car.producer &&
                this.value.equals(car.value);
    }

    public String toString(){
        return "Producer: " + this.producer + " Model: " + this.model + " Cena: " + this.value;
    }

    @Override
    public void recharge(Integer precentage) {
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Naładowano");


    }
}