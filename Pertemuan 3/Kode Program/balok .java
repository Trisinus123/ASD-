public class balok {
    double p, l, t;

    public balok(double a, double b, double c) {
        p = a;
        l = b;
        t = c;
    }

    double hitungLP() {
        double lp = 2 * ((p * l) + (p * t) + (l * t));
        return lp;
    }

    double hitungV() {
        double v = p * l * t;
        return v;
    }
}