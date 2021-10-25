package hu.petrik;

public abstract class Bosszuallo implements Szuperhos{
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmetniAVilagot();

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (((Bosszuallo)szuperhos).isVanEGyengesege() && (szuperhos.mekkoraAzEreje() < this.mekkoraAzEreje())){
            return true;
        }
        return false;
    }

    @Override
    public int mekkoraAzEreje() {
        return (int) this.szuperero;
    }
}
