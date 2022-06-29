import java.util.Scanner;
public class Latihan1Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System. in);
        System. out. println("===Pemilihan Suara Ketua BEM===");
        System. out. println("Masukkan Banyak Suara :");
        int suara = sc. nextInt();
        Latihan p1 = new Latihan (suara);
 sc. nextLine();
        for(int i = 0 ; i < suara ; i++){
            System. out. println("Masukkan Nama/Suara ke- " + (i+1) + " = ");
 p1. kandidat[i] = sc. nextLine();
        }
        int hasil = p1. ModusArray(p1. kandidat, 0, suara, 0, 0);
        System. out. println(" Mayoritas Jumlah Suara adalah : " + p1. kandidat[hasil]);
    }
}