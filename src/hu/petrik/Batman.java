package hu.petrik;

public class Batman implements Szuperhos,Milliardos{
    private double lelemenyesseg;

    public Batman(){
        this.lelemenyesseg = 100;
    }
    @Override
    public int mekkoraAzEreje() {
        return (int) (this.lelemenyesseg * 2);
    }
    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos.mekkoraAzEreje() < this.lelemenyesseg){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return String.format("Batman\n\tLeleményesseg:%f", this.lelemenyesseg);
    }
}
