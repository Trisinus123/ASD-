import java.util.Scanner;

public class SumMain{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int elm;

    System.out.println("\n====================================================");
    System.out.println("Program Menghitung Total (Satuan Juta, Misal 5.9)");
    System.out.print("Masukkan Jumlah Bulan : ");
    elm = sc.nextInt();
    Sum sm = new Sum(elm);
    System.out.println("====================================================");
    for (int i = 0; i < sm.elemen; i++) {
      System.out.print("Masukkan Untung Bulan Ke-"+(i+1)+" = ");
      sm.keuntungan[i] = sc.nextDouble();
    }
    System.out.println("====================================================");
    System.out.println("Algoritma Brute Force");
    System.out.println("Total Keuntungan Perusahaan Selama "+sm.elemen+" Bulan Adalah = "+sm.totalBF(sm.keuntungan));
    System.out.println("====================================================");
    System.out.println("Algoritma Divide Conquer");
    System.out.println("Total Keuntungan Perusahaan Selama "+sm.elemen+" Bulan Adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
  }
}