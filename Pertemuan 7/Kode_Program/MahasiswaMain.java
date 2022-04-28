import java.util.Scanner;

public class MahasiswaMain {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      PencarianMhs gaa = new PencarianMhs();
      System.out.print("\nBerapa Data Yang Masuk urut dari nim terkecil : ");
      int jumMhs= sc.nextInt();
      gaa.inputArr(jumMhs);
      System.out.println("====================================================");
      System.out.println("Masukan data mahasiswa");
      for (int i=0; i<jumMhs; i++) {
          System.out.println("--------------------");
          System.out.print("NIM      : ");
          int nim = sc.nextInt();
          System.out.print("Nama     : ");
          String nama = sc.nextLine();
          System.out.print("Umur     : ");
          int umur = sc.nextInt();
          System.out.print("IPK      : ");
          double ipk = sc.nextDouble();
          Mahasiswa m = new Mahasiswa(nim,nama,umur,ipk);
          gaa.tambah(m);
      }
      System.out.println("========================================");
      System.out.println("=  Data Terurut Keseluruhan Mahasiswa  =");
      System.out.println("========================================");
      gaa.selectionsort();
      System.out.println("Pencarian Data");
      System.out.print("\nMasukan Nama Mahasiswa Yang Dicari : ");
      String nama = sc.next();
      System.out.println("Menggunakan Sequential Search : ");
      int poski = gaa.findSeqSearch(nama);
      gaa.tampilPos(nama, poski);
      gaa.tampilData(nama, poski);
  }
}
