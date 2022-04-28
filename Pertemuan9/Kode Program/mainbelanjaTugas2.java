import java.util.Scanner;
public class mainbelanja {
public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);
	 databelanja str = new databelanja(10);

	 databelanja str1 = new databelanja ("FAA211", "03/04/2022", 3, 150000 );
	 databelanja str2 = new databelanja ("FAA365", "17/04/2022", 8, 800000 );
	 databelanja str3 = new databelanja ("FAA452", "17/04/2022", 5, 450000 );
	 databelanja str4 = new databelanja ("FAA216", "24/04/2022", 6, 300000 );
	 databelanja str5 = new databelanja ("FAA523", "03/04/2022", 5, 250000 );
	 databelanja str6 = new databelanja ("FAA364", "11/04/2022", 8, 400000 );
	 databelanja str7 = new databelanja ("FAA653", "19/04/2022", 5, 250000 );
	 databelanja str8 = new databelanja ("FAA423", "04/04/2022", 7, 700000 );

	 str.push(str1);
	 str.push(str2);
	 str.push(str3);
	 str.push(str4);
	 str.push(str5);
	 str.push(str6);
	 str.push(str7);
	 str.push(str8);

 boolean ulang = true;
 while (ulang == true) {
	 System.out.println(" MENU OPERASI STACK ");
	 System.out.println(" 1. Tambah Struk ");
	 System.out.println(" 2. Ambil Struk ");
	 System.out.println(" 3. Lihat Struk Teratas ");
	 System.out.println(" 4. Tampilkan Struk ");
	 System.out.println(" 5. Keluar ");
	 System.out.println("Pilih Menu : ");
	 int i = input.nextInt();
	 System.out.println("");

 switch (i) {
 case 1 -> {
	 System.out.println("No Transaksi : ");
	 String noTrans = input.next();
	 System.out.println("Tanggal Pembelian : ");
	 String tanggal = input.next();
	 System.out.println("Jumlah Barang : ");
	int jumlah = input.nextInt();
	 System.out.println("Total Bayar : ");
	 int total = input.nextInt();

		 databelanja stt = new databelanja(noTrans, tanggal, jumlah, total);
		 str.push(stt);
		 }
		 case 2 -> {
		 str.pop();
		  System.out.println("---------------------------------");
		 }
		 case 3 -> {
		 str.peek();
		 System.out.println("---------------------------------");
		 }
		 case 4 -> {
		 str.print();
		 System.out.println("---------------------------------");
		 }
		 case 5 -> {
		 System.out.println("--------TERIMAKASIH--------");
		 ulang = false;
        }
       }
      }
     }
    }