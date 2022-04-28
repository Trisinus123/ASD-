import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswa[] m = new mahasiswa[3];
        for (int i = 0; i < m.length; i++) {
            m[i] = new mahasiswa();
        }

        for (int i = 0; i < m.length; i++) {
            System.out.println("\nMasukkan data Mahasiswa ke - " + (i + 1) + " : ");
            System.out.print("Masukkan nama : ");
            m[i].nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            m[i].nim = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            m[i].jk = sc.nextLine();
            System.out.print("Masukkan ipk : ");
            m[i].ipk = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println();

        for (int i = 0; i < m.length; i++) {
            System.out.println("\nData Mahasiswa ke - " + (i + 1) + " : ");
            System.out.println("Nama : " + m[i].nama);
            System.out.println("Nim : " + m[i].nim);
            System.out.println("Jenis kelamin : " + m[i].jk);
            System.out.println("Ipk : " + m[i].ipk);
        }

    }
}