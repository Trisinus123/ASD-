import java.util.Scanner ;
public class MainMhsSLL {
	public static void menu() {
		System.out.println("_____________________________________________") ;
		System.out.println("__________________)Menu(_____________________") ;
		System.out.println("1. Enqueue") ;
		System.out.println("2. Dequeue") ;
		System.out.println("3. Print") ;
		System.out.println("4. Peek") ;
		System.out.println("5. Peek Rear") ;
		System.out.println("6. Peek Position") ;
		System.out.println("7. Print Mahasiswa") ;
		System.out.println("_____________________________________________") ;
		System.out.print("Pilih Opsi : ") ;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in) ;

		AntrianSLL asll = new AntrianSLL() ;

		int pilih = 0 ;
		do {
			menu() ;
			pilih = sc.nextInt() ;
			sc.nextLine() ;
			switch(pilih) {
			case 1 :
				System.out.println("_____________________________________________") ;
				System.out.println("===============)Data Mahasiswa(==============") ;
				System.out.print("NIM \t: ") ;
				String nim = sc.nextLine() ;
				System.out.print("Nama \t: ") ;
				String nama = sc.nextLine() ;
				System.out.print("Absen \t: ") ;
				int absen = sc.nextInt() ;
				System.out.print("IPK \t: ") ;
				double ipk = sc.nextDouble() ;
				Mahasiswa m = new Mahasiswa(nim, nama, absen, ipk) ;
				sc.nextLine() ;
				asll.enqueue(m) ;
				break ;
			case 2 :
				asll.dequeue() ;
				break ;
			case 3 :
				asll.printAll() ;
				break ;
			case 4 : 
				asll.peek() ;
				break ;
			case 5 :
				asll.peekRear() ;
				break ;
			case 6 :
				System.out.print("NIM Mahasiswa : ") ;
				String nym = sc.nextLine() ;
				asll.peekPosition(nym) ;
				break ;
			case 7 :
				System.out.print("Posisi : ") ;
				int pcc = sc.nextInt() ;
				asll.printMahasiswa(pcc) ;
				break ;
			}
		}
		while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7) ;
	}
}