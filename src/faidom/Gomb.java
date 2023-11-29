package faidom;

public class Gomb extends FaIdom {

    private double sugar;

    public Gomb(double sugar) {
        setSugar(sugar);
    }

    public double getSugar() {
        return sugar;
    }

    public final void setSugar(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return 4 / 3 * Math.pow(sugar, 4) * Math.PI;
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + '}';
    }

}
