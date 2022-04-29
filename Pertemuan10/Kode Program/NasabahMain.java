import java.util.Scanner;
public class NasabahMain {
    public static void menu(){
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Belakang");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("===========================");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kapasitas Queue : ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1 :
                    System.out.println("No Rekening : ");
                    String norek = sc.nextLine();
                    System.out.println("Nama : ");
                    String nama = sc.nextLine();
                    System.out.println("Alamat : ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2 :
                    Nasabah data = antri.Dequeue();
                    if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                            System.out.println("Antrian Yang Keluar : " + data.norek + " " + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                            break;
                    }
                case 3 :
                    antri.peek();
                    break;
                case 4 : 
                    antri.peekRear();
                    break;
                case 5 :
                    antri.print();
                    break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
