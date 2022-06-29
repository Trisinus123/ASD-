import java.util.Scanner;

public class PangkatMain{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int elemen;

    System.out.println("\n====================================================");
    System.out.print("Masukkan Jumlah Elemen Yang Ingin Dihitung : ");
    elemen = sc.nextInt();

    Pangkat[] png = new Pangkat[elemen];
    for (int i = 0; i < elemen; i++) {
      png[i] = new Pangkat();
      System.out.print("Masukkan Nilai Yang Akan Dipangkatkan Ke-"+(i+1)+" : ");
      png[i].nilai = sc.nextInt();
      System.out.print("Masukkan Nilai Pangkat Ke-"+(i+1)+" : ");
      png[i].pangkat = sc.nextInt();
    }
      System.out.println("===============================================");
      System.out.println("= 1. Menampilkan Faktorial Brute Force        =");
      System.out.println("= 2. Menampilkan Faktorial Divide and Conquer =");
      System.out.println("===============================================");
      System.out.print("Masukkan pilihan anda : ");
      int menu = sc.nextInt();

      if (menu == 1) {
        System.out.println("Hasil Faktorial Brute Force");
        for (int i = 0; i < elemen; i++) {
          System.out.println("Nilai "+png[i].nilai+" Pangkat : "+png[i].pangkat+" Adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
      }
      if (menu == 2) {
        System.out.println("Hasil Faktorial Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
          System.out.println("Nilai "+png[i].nilai+" Pangkat "+png[i].pangkat+" Adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
      }
    }
  }