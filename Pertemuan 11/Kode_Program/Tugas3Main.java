import java.util.Scanner;

class Tugas3Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Tugas3SLL sll = new Tugas3SLL();
        int pilih;
        do {
          System.out.println("==========================================");
          System.out.println("=         PILIH MENU LINKED LIST         =");
          System.out.println("==========================================");
          System.out.println("= 1. Push                                =");
          System.out.println("= 2. Pop                                 =");
          System.out.println("= 3. CekTop                              =");
          System.out.println("= 4. Print                               =");
          System.out.println("= 9. Keluar                              =");
          System.out.println("==========================================");
          System.out.print("Masukkan pilihan\t: ");
          pilih = sc.nextInt();

          if (pilih == 1) {
            System.out.print("Masukkan Judul\t\t: ");
            String a = sc1.nextLine();
            sll.addFirst(a);
          }
          if (pilih == 2) {
            sll.removeFirst();
            System.out.println("Berhasil melakukan pop!");
          }
          if (pilih == 3) {
            sll.getDataTop();
          }
          if (pilih == 4) {
            sll.print();
          }
          if (pilih == 9) {
            System.out.println("Terimakasih");
          }
        } while (pilih != 9);
    }
}
