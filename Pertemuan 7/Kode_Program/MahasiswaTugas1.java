public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;
    Mahasiswa(int ni, String n, int u , double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }
    void tampil(){
        System.out.println("Nim  = "+nim);
        System.out.println("Nama = "+nama);
        System.out.println("Umur = "+umur);
        System.out.println("IPK  = "+ipk);
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

    void tampil(){
        for (Mahasiswa m:listMhs) {
            m.tampil();
            System.out.println("----------------------");
        }
    }

    int findSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nim == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return (mid);
            } else if (listMhs[mid].nim > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa tmp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].nim > tmp.nim) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }

    void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos); 
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim : " + x);
            System.out.println("Nama : " + listMhs[pos].nama);
            System.out.println("Umur : " + listMhs[pos].umur); 
            System.out.println("IPK : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan ");
        }
    }
}
import java.util.Scanner;
public class MainMahasiswa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumMhs = sc.nextInt(); 
        PencarianMhs data = new PencarianMhs(jumMhs);
        System.out.println("----------------------------------------");
        System.out.println("Masukkan data Mahasiswa");
        for (int i = 0; i < jumMhs ; i++) {
            System.out.println("---------------");
            System.out.print("Nim : ");
            int nim = sc.nextInt();
            System.out.print("Nama  : ");
            String nama = s1.nextLine();
            System.out.print("Umur : ");
            int umur = sc.nextInt();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("----------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa setelah di sorting: ");
        data.insertionSort();
        data.tampil();
        System.out.println("________________________________________"); 
        System.out.println("________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = sc.nextInt();

        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        System.out.println("===========================");

        System.out.println("Menggunakan Binary Search");
        posisi = data.findBinarySearch(cari, 0, jumMhs - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}