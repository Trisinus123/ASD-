public class Tiket{
    String namaPesawat;
    int harga;
    String tujuan;
    int tiketTerjual;

    Tiket(String w, int x, String y, int z) {
        namaPesawat = w;
        harga = x;
        tujuan = y;
        tiketTerjual = z;
    }

    void tampil() {
        System.out.println("Nama Pesawat\t\t: " +namaPesawat);
        System.out.println("Harga Tiket Pesawat\t: "+harga);
        System.out.println("Tujuan\t\t\t: "+tujuan);
        System.out.println("Tiket Terjual\t\t: "+tiketTerjual);
    }
}
