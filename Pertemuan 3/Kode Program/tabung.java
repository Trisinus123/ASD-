public class tabung {
    double r, t;

    public tabung(double a, double b) {
        r = a;
        t = b;
    }

    double hitungLP() {
        double lp = 2 * (Math.PI * r * (r + t));
        return lp;
    }

    double hitungV() {
        double v = Math.PI * r * r * t;
        return v;
    }
}