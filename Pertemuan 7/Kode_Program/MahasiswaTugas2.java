import java.util.Scanner;
class Mahasiswa {
	int nim, umur;
	String nama;
	double ipk;

	Mahasiswa(int ni, String n, int u, double i) {
		nim = ni;
		nama = n;
		umur = u;
		ipk = i;
	}

	void tampil() {
		System.out.println("Nim = " + nim);
		System.out.println("Nama = " + nama);
		System.out.println("Umur = " + umur);
		System.out.println("IPK = " + ipk);
	}
}
class PencarianMhs {
	Mahasiswa[] listMhs; 
	int idx;

	PencarianMhs(int x) {
		listMhs = new Mahasiswa[x];
	}

	void tambah(Mahasiswa m) {
		if (idx < listMhs.length) {
			listMhs[idx] = m;
			idx++;
		} else {
			System.out.println("Data sudah penuh !! ");
		}
	}

	void tampil() {
		for (Mahasiswa m:listMhs) {
			m.tampil();
			System.out.println("----------------------");
		}
	}

	void findSeqSearch(String cari) {
		int posisi = -1;
		for (int i = 0; i < listMhs.length; i++) {
			if (listMhs[i].nama.equalsIgnoreCase(cari)) {
				posisi = i;
				tampilData(cari,posisi);
			}
		}
	}

	void tampilData(String x, int pos) {
		if (pos != -1) {
			System.out.println("Nim : " + listMhs[pos].nim);
			System.out.println("Nama : " + x);
			System.out.println("Umur    : " + listMhs[pos].umur); 
			System.out.println("IPK : " + listMhs[pos].ipk);
		} else {
			System.out.println("data " + x + " tidak ditemukan");
		}
	}
}
import java.util.Scanner;
public class MainMahasiswa4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.print("Masukkan jumlah Mahasiswa : ");
		int jumMhs = s.nextInt();
		PencarianMhs data = new PencarianMhs(jumMhs);
		System.out.println("----------------------------------------");
		System.out.println("Masukkan data Mahasiswa");

		for (int i = 0; i < jumMhs; i++) {
			System.out.println("---------------");
			System.out.print("Nim : ");
			int nim = s.nextInt();
			System.out.print("Nama : ");
			String nama = s1.nextLine();
			System.out.print("Umur : ");
			int umur = s.nextInt(); 
			System.out.print("IPK : ");
			double ipk = s.nextDouble();
			Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
			data.tambah(m);
		}

		System.out.println("----------------------------------------");
		System.out.println("Data Keseluruhan Mahasiswa : ");
		data.tampil();
		System.out.println("________________________________________");
		System.out.println("________________________________________");
		System.out.println("Pencarian Data : ");
		System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
		System.out.print("NAMA : ");
		String cari = s1.nextLine();
		System.out.println("Menggunakan Sequential Search");
		data.findSeqSearch(cari);
	}
}