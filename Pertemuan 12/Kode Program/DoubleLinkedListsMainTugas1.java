import java.util.Scanner;

public class DLLQeueuMain {
public static void main(String[] args) throws Exception {
	 Scanner sc = new Scanner(System.in);
	 DoubleLinkedListQueue DLQ = new DoubleLinkedListQueue();
	 int balikmenu;
	 do {
	 System.out.println("+++++++++++++++++++++++++++++");
	 System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
	 System.out.println("+++++++++++++++++++++++++++++");
	 System.out.println("1. Tambah Data Penerima");
	 System.out.println("2. Hapus Data Pengantri");
	 System.out.println("3. Daftar Penerima Vaksin");
	 System.out.println("4. Keluar");
	 System.out.println("+++++++++++++++++++++++++++++");

 int pilihan = sc.nextInt();
 if (pilihan == 1){
 sc.nextLine();
	System.out.println("-----------------------------");
	System.out.println("Masukkan Data Penerima Vaksin");
	System.out.println("-----------------------------");
	System.out.print("Nomor Antrian : ");
	String nomor = sc.nextLine();
	System.out.print("Nama Penerima : ");
	String nama = sc.nextLine();
	DLQ.Enqueue(nomor, nama);
}	
	  if (pilihan == 2){
	 DLQ.Dequeue();
	 }
	 if (pilihan == 3){
	 DLQ.Print();
	 }
	 if (pilihan == 4){

	 System.exit(0);
	 }
	 System.out.println();
	 System.out.println("Apakah Anda Ingin kembali ke menu");
	 System.out.println("0 = TidaK");
	 System.out.println("1 = Iya");
	 balikmenu = sc.nextInt();
	 System.out.println();
     } while (balikmenu == 1);
    }
 }
