import java.util.Scanner;
public class PersegiPanjangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Array: ");
        int jumlah = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

       for(int i = 0; i < 3; i++){
           ppArray[i] = new PersegiPanjang();
           System.out.println("Persegi Panjang ke- " + i);
           System.out.println("Masukkan Panjang: ");
           ppArray[i].panjang = sc.nextInt();
           System.out.println("Masukkan Lebar: ");
           ppArray[i].lebar = sc.nextInt();
       }

       for(int i = 0; i < 3; i++){
           System.out.println("Persegi Panjang ke- " + i);
           System.out.println("Panjang: " + ppArray[i].panjang + "Lebar: " + ppArray[i].lebar);
       }
    }
}