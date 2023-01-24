package devices;
import creatures.Human;

import java.util.Date;


public class Transactions {
    public Human seller;
    public Human buyer;
    public Double price = 0.0;
    public Transactions(Human seller, Human buyer, Double price){
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
    }

}
