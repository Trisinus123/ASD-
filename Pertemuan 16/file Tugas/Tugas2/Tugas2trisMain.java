import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Tugas2trisMain {
 
    List<Tugas2tris> mhs = new ArrayList<>();
    List<Tugas2trisMK> mk = new ArrayList<>();
    List<Tugas2trisNilai> nli = new ArrayList<>();
    static Scanner sclia = new Scanner(System.in);
    public static void main(String[] args) {
    Tugas2trisMain tris = new Tugas2trisMain();
    int pilih;
    tris.setDataMHSdanMatkul();
 do {
 
    System.out.println("***********************************************");
    System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");

    System.out.println("***********************************************");
    System.out.println("1. Input Nilai");
    System.out.println("2. Tampil Nilai");
    System.out.println("3. Mencari Nilai Mahasiswa");
    System.out.println("4. Urut Data Nilai");
    System.out.println("5. Keluar");

    System.out.println("***********************************************");
    System.out.print("Pilih : ");
    pilih = sclia.nextInt();
   if(pilih == 1) {
    tris.menusatu();
    } else if (pilih == 2) {
    tris.menudua();
    } else if (pilih == 3) {
    tris.menutiga();
    } else if (pilih == 4) {
    tris.menuempat();
    } else {
    System.out.println("Good Bye!!!");
    }
    System.out.println("");
    } while (pilih >= 1 && pilih <= 4);
 }
    void setDataMHSdanMatkul() {
    mhs.add(new Tugas2tris("20001", "Thalhah", "021xxx"));
    mhs.add(new Tugas2tris("20002", "Zubair", "021xxx"));
    mhs.add(new Tugas2tris("20003", "Rahman","021xxx"));
    mhs.add(new Tugas2tris("20004", "Sa'ad", "021xxx"));
    mhs.add(new Tugas2tris("20005", "Sa'id", "021xxx"));
    mhs.add(new Tugas2tris("20006", "Ubaidah", "021xxx"));
    mk.add(new Tugas2trisMK("00001", "Internet of Things", "3"));
    mk.add(new Tugas2trisMK("00002", "Algo dan Struk Dat", "2"));
    mk.add(new Tugas2trisMK("00003", "Algo & Pemrograman", "2"));
    mk.add(new Tugas2trisMK("00004", "Prak Algo & StrukDat","3"));
    mk.add(new Tugas2trisMK("00005", "Prak Algo Pemrograman","3"));
 }
    void menusatu() {
    sclia.nextLine();
    System.out.println("Masukkan Data ");
    System.out.print("Kode : ");
    String kode = sclia.next();
    System.out.print("Nilai : ");
    float nilai = sclia.nextFloat();
    System.out.println("\nDAFTAR MAHASISWA");
 
    System.out.println("***********************************************");
    System.out.println("NIM\tNama\t\tTelf");
    for (Tugas2tris mahasiswa : mhs) {
    System.out.println(mahasiswa.nim + "\t" + mahasiswa.nama + "\t\t" + mahasiswa.notelp);
 }
    boolean ketemu = true;
    String pilihmahasiswa;
    int konfirmasi2 = 0;
    do {
    System.out.print("Pilih Mahasiswa by NIM : ");
    pilihmahasiswa = sclia.next();
    for (Tugas2tris mahasiswa : mhs) {
    if (pilihmahasiswa.equals(mahasiswa.nim)) {
    ketemu = false;
    konfirmasi2++;
   }
 }
    if (konfirmasi2 == 0) {
    System.out.println("Data Kode NIM Tidak Ditemukan");
    }
    } while (ketemu);
    System.out.println("\nDAFTAR MATA KULIAH");

    System.out.println("***********************************************");
    System.out.println("Kode\tMata Kuliah\t\t\tSKS");
    for (Tugas2trisMK matakuliah : mk) {
    System.out.println(matakuliah.kode + "\t" + 
    matakuliah.matakuliah + "\t\t" + matakuliah.sks);
 }
    boolean ketemu2 = true;
    String pilihmatakuliah;
    int konfirmasi = 0;
    do {
    System.out.print("Pilih MK by Kode : ");
    pilihmatakuliah = sclia.next();
    for (Tugas2trisMK mklh : mk) {
    if (pilihmatakuliah.equals(mklh.kode)) {
    ketemu2 = false;
    konfirmasi++;
   }
 }
 if (konfirmasi == 0) {
    System.out.println("Data Kode Matakuliah Tidak Ditemukan");
    }
    } while (ketemu2);
    nli.add(new Tugas2trisNilai(kode, nilai, pilihmatakuliah, 
    pilihmahasiswa));
 }
    void menudua() {
    System.out.println("DAFTAR NILAI MAHASISWA");

    System.out.println("***********************************************");
    System.out.println("NIM\tNama Mahasiswa\t\tMata Kuliah\t\t\tSKS\tNilai");
    nli.forEach(nilaisatuan -> {
    System.out.print(nilaisatuan.nimmhs + "\t");
    for (Tugas2tris mahasiswa : mhs) {
    if (mahasiswa.nim.equals(nilaisatuan.nimmhs)) {
 
    System.out.print(mahasiswa.nama + "\t\t\t");
    }
    }
    for (Tugas2trisMK matkul : mk) {
    if (matkul.kode.equals(nilaisatuan.kodematakuliah)) 
   {System.out.print(matkul.matakuliah + "\t\t" + matkul.sks + "\t");
    }
 } 
    System.out.println(nilaisatuan.nilai);
   });
 }
    void menutiga() {
    menudua();
    System.out.print("Masukkan Data Mahasiswa[nim] : ");
    String caridata = sclia.next();
    int konfirmasi3 = 0;
    System.out.println("NIM\tNama Mahasiswa\t\tMata Kuliah\t\t\tSKS\tNilai");
    for (Tugas2trisNilai carinilai : nli) {
    if (carinilai.nimmhs.equals(caridata)) {
    System.out.print(carinilai.nimmhs + "\t");
    for (Tugas2tris mahasiswa : mhs) {
    if (mahasiswa.nim.equals(carinilai.nimmhs)) {
    System.out.print(mahasiswa.nama + "\t\t\t");
   }
 }
    for (Tugas2trisMK matkul : mk) {
    if (matkul.kode.equals(carinilai.kodematakuliah)){
    System.out.print(matkul.matakuliah + "\t\t" + matkul.sks + "\t");
   }
 }
    System.out.println(carinilai.nilai);
    konfirmasi3++;
    for (Tugas2trisMK matkul : mk) {
    if (matkul.kode.equals(carinilai.kodematakuliah)){
    System.out.print("Total SKS " + matkul.sks + " telah diambil");
    }
   }
  }
 }
    if (konfirmasi3 == 0) {
    System.out.println("Data Dengan NIM " + caridata + " Tidak Ditemukan");
    }
 }
    void menuempat() {
    for (int i = 0; i < nli.size() - 1; i++) {
    for (int j = 0; j < nli.size() - i - 1; j++) {
    if (nli.get(j).nilai > nli.get(j + 1).nilai) {
    float swap = nli.get(j).nilai;
   nli.get(j).nilai = nli.get(j + 1).nilai;
   nli.get(j + 1).nilai = swap;
    }
   }
  }
 menudua();
 }
    
}
