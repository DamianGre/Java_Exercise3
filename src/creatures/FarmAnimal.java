package creatures;

public class FarmAnimal extends Animal implements Edible{
    FarmAnimal(String specie){
        super(specie);
    }
    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println("Mam nadzieję, że smakowało MORDERCO");
    }

    @Override
    public boolean isPoisoned() {
        if(this.specie == "snake") {
            return true;
        }
        else{
            return false;
        }
    }


}
