public class bola {
    double r;

    public bola(double a) {
        r = a;
    }

    double hitungLP() {
        double lp = 4 * Math.PI * r * r;
        return lp;
    }

    double hitungV() {
        double v = (4 * Math.PI * r * r * r) / 3;
        return v;
    }
}