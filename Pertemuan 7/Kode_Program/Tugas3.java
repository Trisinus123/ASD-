public class Tugas3{
  public int  nilai [] [];
  public int jmlhnilai1;
  public int jmlhnilai2;

  public Tugas3(int N[][], int jmlhnilai1, int jmlhnilai2){
    this.jmlhnilai1 = jmlhnilai1;
    this.jmlhnilai2 = jmlhnilai2;
    nilai = new int [jmlhnilai1][jmlhnilai2];
    for (int i = 0; i < jmlhnilai1; i++) {
      for (int j = 0; j < jmlhnilai2; j++) {
        nilai [i][j] = N[i][j];
      }
    }
  }
  public int findSearch(int cari){
    int posisi = -1;
    int posisi1 = 0;
    for (int i = 0; i < jmlhnilai1; i++) {
      for (int j = 0; j < jmlhnilai2; j++) {
        if (nilai [i][j] == cari) {
          posisi1 = i;
          posisi = j;
          System.out.println("Cari\t\t\t: "+cari);
          System.out.println("Ditemukan Pada Baris Ke-"+posisi1+"Kolom Ke-"+posisi);
          break;
        }
      }
    }
    return posisi;
  }
  public void tampil(){
    for (int i = 0; i < jmlhnilai1; i++) {
      for (int j = 0; j < jmlhnilai2; j++) {
        System.out.print(nilai[i][j]+" ");
      }
      System.out.println("");
    }
  }
}
import java.util.Scanner;

public class Tugas3Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int y, z, cari, posisi;

    System.out.print("Masukkan Jumlah Baris : ");
    y = sc.nextInt();
    System.out.print("Masukkan Jumlah Kolom : ");
    z = sc.nextInt();

    int nilai [][] = new int [y][z];
    for (int i = 0; i < y; i++) {
      for (int j = 0; j < z; j++) {
        System.out.print("Masukkan Nilai Ke-"+i+" "+j+" : ");
        nilai [i][j] = sc.nextInt();
      }
    }
    Tugas3 arr = new Tugas3(nilai,y,z);
    System.out.println("\nTampil Nilai Array\t: ");
    arr.tampil();
    System.out.print("\nInput Nilai Yang Dicari\t: ");
    cari = sc.nextInt();
    posisi = arr.findSearch(cari);
    if (posisi == -1) {
      System.out.println("Data Tidak Di Temukan");
    }
  }
}