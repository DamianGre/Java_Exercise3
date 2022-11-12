public class Car {
    final String producer;
    final String model;
    Double value;
    Double millage;
    String colour;
    Double width;
    Double height;
    Double lenght;

    Car(String producer, String model, Double value) {
        this.producer = producer;
        this.model = model;
        this.value = value;
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
}