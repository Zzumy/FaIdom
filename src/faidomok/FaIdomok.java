package faidomok;

import faidom.FaIdom;
import faidom.Gomb;
import java.util.List;

public class FaIdomok {

    private List<FaIdom> idomok;

    public FaIdomok() {
        setIdomok(idomok);
    }

    public List<FaIdom> getIdomok() {
        return idomok;
    }

    public final void setIdomok(List<FaIdom> idomok) {
        this.idomok = idomok;
    }

    public double osszSuly() {
        return FaIdom.getFajsuly();
    }

    public double osszGombSuly() {
        return Gomb.getFajsuly();
    }

    public FaIdom minV() {
        return null;
    }

    public FaIdom maxV() {
        return null;
    }

    public void run() {

    }

}
