package faidom;

public abstract class FaIdomok {

    private static final double FAJSULY = 0.8;

    public static double getFajsuly() {
        return FAJSULY;
    }

    public abstract double terfogat();

    public double suly() {
        return FAJSULY * terfogat();
    }

    @Override
    public String toString() {
        return "FaIdom{" + "fajsuly=" + FAJSULY + '}';
    }

}
