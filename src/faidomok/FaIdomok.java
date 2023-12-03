package faidomok;

import faidom.Gomb;
import java.util.List;

public class FaIdomok {

    private List<faidom.FaIdomok> idomok;

    public FaIdomok() {
        setIdomok(idomok);
    }

    public List<faidom.FaIdomok> getIdomok() {
        return idomok;
    }

    public final void setIdomok(List<faidom.FaIdomok> idomok) {
        this.idomok = idomok;
    }

    public double osszSuly() {
        double sum = 0;
        for (faidom.FaIdomok faIdom : idomok) {
            sum += faIdom.suly();
        }
        return sum;
    }

    public double osszGombSuly() {
        double sum = 0;
        for (faidom.FaIdomok faIdom : idomok) {
            if (faIdom instanceof Gomb) {
                sum += faIdom.suly();
            }
        }
        return sum;

    }

    public faidom.FaIdomok minV() {
        int min = 0;
        for (int ix = 1; ix < idomok.size(); ix++) {
            if (idomok.get(min).terfogat() > idomok.get(ix).terfogat()) {
                min = ix;
            }
        }
        return idomok.get(min);
    }

    public faidom.FaIdomok maxV() {
        int max = 0;
        for (int ix = 1; ix < idomok.size() - 1; ix++) {
            if (idomok.get(max).terfogat() < idomok.get(ix).terfogat()) {
                max = ix;
            }
        }
        return idomok.get(max);
    }

    public void run() {
        System.out.println("osszSuly: " + osszSuly());
        System.out.println("osszGombSuly: " + osszGombSuly());
        System.out.println("min: " + minV());
        System.out.println("max: " + maxV());
    }

}
