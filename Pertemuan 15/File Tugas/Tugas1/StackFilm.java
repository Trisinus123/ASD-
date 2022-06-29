import java.util.Scanner ;
import java.util.* ;
public class StackFilm {
	
	static void menu() {
		System.out.println("====================================") ;
		System.out.println("Data Film Layar Lebar Sepanjang Masa") ;
		System.out.println("====================================") ;
		System.out.println("[1] Input Judul Film") ;
		System.out.println("[2] Hapus Data Film Teratas") ;
		System.out.println("[3] Cek Judul Film Teratas") ;
		System.out.println("[4] Info Semua Judul Film") ;
		System.out.println("[5] Keluar") ;
		System.out.println("====================================") ;
		System.out.print("Pilih Opsi : ") ;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		Scanner scs = new Scanner(System.in) ;
		Film film = new Film() ;
		Stack<Film> st = new Stack<>() ;

		int opsi ;

		do {
			menu() ;
			opsi = sc.nextInt() ;
			switch(opsi) {
			case 1 :
				System.out.print("ID Film : ") ;
				int id = sc.nextInt() ;
				System.out.print("Judul Film : ") ;
				String judul = scs.nextLine() ;
				System.out.print("Tahun Tayang : ") ;
				int tahun = sc.nextInt() ;
				System.out.print("Director : ") ;
				String director = scs.nextLine() ;

				Film fl = new Film(id, judul, tahun, director) ;
				st.push(fl) ;
				break ;
			case 2 :
				Film top = st.pop() ;
				System.out.println("Mahasiswa { " + "ID Film : " + top.id + ", Judul Film : " + top.judul + ", Tahun Tayang : " + top.tahun + ", Director : " + top.director + "}") ;
				break ;
			case 3 :
				Film peek = st.peek() ;
				System.out.println("Mahasiswa { " + "ID Film : " + peek.id + ", Judul Film : " + peek.judul + ", Tahun Tayang : " + peek.tahun + ", Director : " + peek.director + "}") ;
				break ;
			case 4 :
				st.stream().forEach(d -> {
					System.out.println("Mahasiswa { " + "ID Film : " + d.id + ", Judul Film : " + d.judul + ", Tahun Tayang : " + d.tahun + ", Director : " + d.director + "}") ;
				}) ;
				break ;
			}
		} while (opsi == 1 || opsi == 2 || opsi == 3 || opsi == 4) ;
	}
}