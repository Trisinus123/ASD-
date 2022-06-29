public class Daftar{

    Tiket listtkt[] = new Tiket[3];
    int idx;

    void tambah(Tiket t) {
        if (idx < listtkt.length) {
            listtkt[idx] = t;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampil() {
         for (Tiket t : listtkt) {
            t.tampil();
            System.out.println("=================================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listtkt.length - 1; i++) {
            for (int j = 1; j < listtkt.length - 1; j++) {
                if (listtkt[j].harga > listtkt[j - 1].harga) {

                    Tiket tmp = listtkt[j];
                    listtkt[j] = listtkt[j - 1];
                    listtkt[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listtkt.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listtkt.length; j++) {
                if (listtkt[j].harga < listtkt[idxMin].harga) {
                    idxMin = j;
                }
            }

            Tiket tmp = listtkt[idxMin];
            listtkt[idxMin] = listtkt[i];
            listtkt[i] = tmp;
        }
    }
}