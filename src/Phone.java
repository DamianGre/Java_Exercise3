public class Phone {
    final String producer;
    final String model;

    Phone(String producer, String model)
    {
        this.producer = producer;
        this.model = model;
    }

    public String toString() {
        return "Producer: " + this.producer + " " + "Model: " + this.model;
    }
}