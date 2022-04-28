import java.util.Scanner;

public class TiketMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Daftar gaprim = new Daftar();
        int a = 3;

        for (int i = 0; i < a; i++) {
            System.out.print("Nama Pesawat\t\t: ");
            String namaPesawat = sc.next();
            System.out.print("Tujuan\t\t\t: ");
            String ketersediaanTiket = sc.next();
            System.out.print("Harga Tiket Pesawat\t: ");
            int harga = sc.nextInt();
            System.out.print("Tiket yang terjual\t: ");
            int tiketTerjual = sc.nextInt();
            Tiket pri = new Tiket (namaPesawat, harga, ketersediaanTiket, tiketTerjual);
            gaprim.tambah(pri);
            System.out.println("-----------------------------------");
        }
        System.out.println("\n=======Data Sebelum Sorting=======");
        gaprim.tampil();

        System.out.println("\n=======Data Setelah Sorting======");
        gaprim.bubbleSort();
        gaprim.tampil();

        System.out.println("\n===Data SelectionSort Sorting===");
        gaprim.selectionSort();
        gaprim.tampil();
    }
}