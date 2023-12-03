package faidom;

public class Hasab extends FaIdomok {

    private double a, b, magassag;

    public Hasab(double a, double b, double magassag) {
        setA(a);
        setB(b);
        setMagassag(magassag);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getMagassag() {
        return magassag;
    }

    public final void setA(double a) {
        this.a = a;
    }

    public final void setB(double b) {
        this.b = b;
    }

    public final void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    @Override
    public double terfogat() {
        return a * b * magassag;
    }

    @Override
    public String toString() {
        return "Hasab{" + "a=" + a + ", b=" + b + ", magassag=" + magassag + '}';
    }

}
