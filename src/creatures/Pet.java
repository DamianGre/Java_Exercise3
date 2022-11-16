package creatures;

import devices.Salleable;

public class Pet extends Animal implements Salleable {
    public Pet(String specie){
        super(specie);
    }
    public void sell(creatures.Human seller, creatures.Human buyer, Double price){

    }
}
