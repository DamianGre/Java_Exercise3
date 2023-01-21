package devices;
import creatures.Human;

public interface Salleable {
     void sell(Human seller, Human buyer, Double price) throws Exception;
}
