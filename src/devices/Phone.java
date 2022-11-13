package devices;

public class Phone extends Device{


    public Phone(String producer, String model, Integer yearOfProduction)
    {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void recharge(Integer precentage) {
        System.out.println("Ładuje");
        System.out.println("Ładuje");
        System.out.println("Naładowano");
    }

    public String toString() {
        return "Producer: " + this.producer + " " + "Model: " + this.model;
    }
}