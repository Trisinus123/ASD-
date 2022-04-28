import java.util.Scanner;
public class stackmain {
 public static void main (String[]args){

 stack stk = new stack (5);
 Scanner sc = new Scanner(System.in);
 char pilih;

 do {
	 System.out.println("Jenis: ");
	 String jenis = sc.nextLine();
	 System.out.println("Warna: ");
	 String warna = sc.nextLine();
	 System.out.println("Merk: ");
	 String merk = sc.nextLine();
	 System.out.println("Ukuran: ");
	 String ukuran = sc.nextLine();
	 System.out.println("Harga: ");
	 double harga = sc.nextDouble();

	 pakaian p = new pakaian (jenis, warna, merk, ukuran, harga);
	 System.out.println("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
	 pilih = sc.next().charAt(0);
	 sc.nextLine();
	 stk.push(p);
	 } while (pilih == 'y');
	 stk.print();
	 stk.pop();
	 stk.peek();
	 stk.print();

	 } while (pilih == 'y');

 do {
	 System.out.println("\n=====MENU=====");
	 System.out.println("= 1.Print =");
	 System.out.println("= 2.Pop =");
	 System.out.println("= 3.Peek =");
	 System.out.println("= 4.Keluar =");
	System.out.println("==============");

	 System.out.println("Masukkan Menu : ");
	 menu = sc.nextInt();

 switch (menu) {
	 case 1 -> stk.print();
	 case 2 -> stk.pop();
	 case 3 -> stk.peek();
	 case 4 -> System.out.println("Keluar");
	 default -> System.out.println("Menu tidak tersedia");
    }
       
       } while (menu != 4);
   }
 }



