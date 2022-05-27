import java.util.Scanner;

public class Tugas2Main {
    public static void main(String[] args)throws Exception {
        Tugas2DLL dll = new Tugas2DLL();
        Scanner sc = new Scanner(System.in);

        int menu;
        do {
          System.out.println("\n=================================");
          System.out.println("=  DATA FILM LAYAR LEBAR   =    ");
          System.out.println("=================================");
          System.out.println("= 1. Tambah Data Awal           =");
          System.out.println("= 2. Tambah Data Akhir          =");
          System.out.println("= 3. Tambah Data Index Tertentu =");
          System.out.println("= 4. Hapus Data Pertama         =");
          System.out.println("= 5. Hapus Data Terakhir        =");
          System.out.println("= 6. Hapus Data Tertentu        =");
          System.out.println("= 7. Cetak                      =");
          System.out.println("= 8. Cari id Film               =");
          System.out.println("= 9. Urut Data Rating Film-DESC =");
          System.out.println("= 10. Keluar                    =");
          System.out.println("=================================");
          System.out.print("Masukkan Menu Pilihan : ");
          menu = sc.nextInt();

          if (menu == 1) {
            sc.nextLine();
            System.out.println("Masukkan Data  Film Posisi Awal");
            System.out.print("id Film\t\t:");
            String id = sc.nextLine();
            System.out.print("judul Film\t:");
            String judul = sc.nextLine();
            System.out.print("rating\t\t: ");
            double rating = sc.nextDouble();
            dll.addFirst(id, judul, rating);
          }
          if (menu == 2) {
          sc.nextLine();
            System.out.println("Masukkan data Film posisi akhir");
            System.out.print("id Film\t\t: ");
            String id = sc.nextLine();
            System.out.print("judul Film\t:");
            String judul = sc.nextLine();
            System.out.print("rating\t\t: ");
            double rating = sc.nextDouble();
            dll.addLast(id, judul, rating);
          }

          if (menu == 3) {
            sc.nextLine();
            System.out.println("Masukkan data Film");
            System.out.print("id Film\t\t: ");
            String id = sc.nextLine();
            System.out.print("id Film\t\t: ");
            String judul = sc.nextLine();
            System.out.print("rating\t\t: ");
            double rating = sc.nextDouble();
            System.out.print("Data Film ini akan dimasukkan di urutan ke-3 ");
            int idx = sc.nextInt();
            dll.add(id, judul, rating, idx);
          }
          if (menu == 4) {
            dll.removeFirst();
            System.out.println("Menghapus data pertama");
          }
          if (menu == 5) {
            dll.removeLast();
            System.out.println("Menghapus data terakhir");
          }
          if (menu == 6) {
            System.out.print("Menghapus data pada index ke- ");
            int pt = sc.nextInt();
            dll.remove(pt);
            System.out.println("Menghapus data pada index-"+pt);
          }
          if (menu == 7) {
            System.out.println("\n=================================");
            dll.print();
          }
          if (menu == 8) {
            sc.nextLine();
            System.out.print("Masukkan id yang dicari : ");
            String id = sc.nextLine();
            dll.search(id);
          }
          if (menu == 9) {
            System.out.println("\n=================================");
            dll.bubbleSort();
          }
          if (menu == 10) {
            System.out.println("\nTERIMAKSIH");
          }
        } while (menu != 10);
      }
}
