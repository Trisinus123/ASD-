import java.util.Scanner;

public class tanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa tanah yang ingin and hitung? jawab = ");
        int hitungan = sc.nextInt();
        System.out.println();
        tanah[] land = new tanah[hitungan];

        for (int i = 0; i < land.length; i++) {
            System.out.print("Masukkan panjang tanah ke - " + (i + 1) + " = ");
            int a = sc.nextInt();
            System.out.print("Masukkan lebar tanah ke - " + (i + 1) + " = ");
            int b = sc.nextInt();
            land[i] = new tanah(a, b);
            System.out.println();
        }

        int x = 0;
        int z = 0;
        for (int i = 0; i < land.length; i++) {
            if (land[i].hitungLuas() > x) {
                x = land[i].hitungLuas();
                z = i + 1;
            }
        }

        for (int i = 0; i < land.length; i++) {
            System.out.println("Luas tanah ke - " + (i + 1) + " = " + land[i].hitungLuas());
        }

        System.out.println("Tanah terluas adalah tanah ke - " + z);

    }
}