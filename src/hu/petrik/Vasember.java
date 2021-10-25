package hu.petrik;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{
    private Random rnd = new Random();

    public Vasember(){
        super(150,true);
    }

    @Override
    public boolean megmetniAVilagot() {
        if (this.mekkoraAzEreje() > 1000){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void kutyutKeszit() {
        this.setSzuperero(rnd.nextDouble()*10);
    }

    @Override
    public String toString() {
        String gyengeseg = this.isVanEGyengesege() ? "Van" : "Nincs";
        return String.format("Vasember\n\tSzupererő: %d\n\tGyengesege: ",this.mekkoraAzEreje(),gyengeseg);
    }
}
