import java.util.Scanner;

public class bangunMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berapa jumlah bangun pada masing-masing jenisnya? jawab = ");
        int input = sc.nextInt();

        balok[] blk = new balok[3];
        tabung[] tbg = new tabung[2];
        bola[] ball = new bola[1];

        for (int i = 0; i < input; i++) {
            System.out.print("\nMasukkan p balok ke - " + (i + 1) + " = ");
            double a = sc.nextDouble();
            System.out.print("Masukkan l balok ke - " + (i + 1) + " = ");
            double b = sc.nextDouble();
            System.out.print("Masukkan t balok ke - " + (i + 1) + " = ");
            double c = sc.nextDouble();
            blk[i] = new balok(a, b, c);
        }

        for (int i = 0; i < input; i++) {
            System.out.print("\nLuas Permukaan Balok " + (i + 1) + " = " + blk[i].hitungLP() +
                    "\nVolume Balok " + (i + 1) + " = " + blk[i].hitungV());
        }

        for (int i = 0; i < input; i++) {
            System.out.print("Masukkan r tabung ke - " + (i + 1) + " = ");
            double a = sc.nextDouble();
            System.out.print("Masukkan t tabung ke - " + (i + 1) + " = ");
            double b = sc.nextDouble();
            tbg[i] = new tabung(a, b);
        }

        for (int i = 0; i < input; i++) {
            System.out.print("\n\nLuas Permukaan Tabung " + (i + 1) + " = " + tbg[i].hitungLP() +
                    "\nVolume Tabung " + (i + 1) + " = " + tbg[i].hitungV());
        }
        for (int i = 0; i < input; i++) {
            System.out.print("Masukkan r tabung ke - " + (i + 1) + " = ");
            double a = sc.nextDouble();
            ball[i] = new bola(a);
        }

        for (int i = 0; i < input; i++) {
            System.out.print("\n\nLuas Permukaan Bola " + (i + 1) + " = " + ball[i].hitungLP() +
                    "\nVolume Bola " + (i + 1) + " = " + ball[i].hitungV());
        }

    }
}