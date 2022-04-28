public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga[] stArray = new Segitiga[4];

        stArray[0] = new Segitiga(15,3);
        stArray[1] = new Segitiga(20,10);
        stArray[2] = new Segitiga(14,6);
        stArray[3] = new Segitiga(28,10);

        for(int i = 0; i < 4; i++){
            System.out.println("Luas Segitiga Ke- "+ i + ": " + stArray[i].hitungLuas());
        }
        for(int i = 0; i < 4; i++){
            System.out.println("Keliling Segitiga Ke- " + i + ": " + stArray[i].hitungKeliling());
        }
    }
}