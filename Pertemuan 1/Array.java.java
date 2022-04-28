import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
    int [] [] stockBunga = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9},};
    String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    String[] cabangToko = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
    int total = 0;
    for (int i = 0; i < stockBunga.length; i++){
        for (int j = 0; j < stockBunga.length; j++){
            total = total + stockBunga[i][j];
        }
    }
    System.out.println("==============================================");
    System.out.println("Jumlah Stock bunga di seluruh Cabang : " + total);
    System.out.println("==============================================");
    System.out.println("Jumlah Stok berdasarkan jenis bunga di seluruh Cabang : ");
    System.out.println("|");
    for (int i = 0; i < stockBunga.length; i++){
        total = 0;
        for (int j = 0; j < stockBunga[0].length; j++){
            total = total + stockBunga[j][i];
        }
        System.out.println("bunga" + "" + jenisBunga[i] + " : " + total);
    }

    int[] hargaJenisBunga = {75000, 50000, 60000, 10000};
    long pendapatan = 0;
    for (int i = 0; i < stockBunga.length; i++) {
        int totalCabang = 0;
        for (int j = 0; j < stockBunga[0].length; j++) {
            totalCabang = totalCabang + stockBunga[j][i];
        }

        pendapatan += (totalCabang * hargaJenisBunga[i]);

    }
    System.out.println("=======================================================================");
    System.out.println("Pendapatan jika seluruh bunga terjual pada semua cabang : " + "RP. " + pendapatan);
    System.out.println("=======================================================================");
    
    int [] pengurangan = {1, 2, 0, 5};
    pendapatan = 0;
    System.out.println("Stock Bunga di Cabang Royal Garden 1 :");
    System.out.println("|");
    for (int i = 1; i < 2; i++){
        int totalCabang = 0;
        for (int j = 0; j < stockBunga[0].length; j++) {
        stockBunga[0][j] = stockBunga[0][j]-pengurangan[j];
        System.out.println(jenisBunga[j]+" "+stockBunga[0][j]);
        pendapatan += (stockBunga[0][j] * hargaJenisBunga[j]);
        }

    }
    System.out.println("=====================================================================================");
    System.out.println("Pendapatan bunga di cabang Royal Garden 1 setelah pengurangan stock : " + "RP. " + pendapatan);
    System.out.println("=====================================================================================");
    }
}
