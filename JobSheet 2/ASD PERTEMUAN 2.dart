ASD PERTEMUAN 2
NAMA        : Trisinus Gulo
KELAS/ABSEN : TI1G/28
NIM         : 2141720035

## 2.2.3
1. sebutkan 2 karakteristik class/objek!
jawab : - Class/ objek memiliki sesuatu data/ karakter/ atribut
        - Class/ objek bisa melakukan suatu tingkah laku/ method
2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?
jawab : Kata kunci mendeklarasikan class yaitu 
        class NamaClass{
      }
3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?
jawab :- Terdapat 4 atribut, yaitu namaBarang (String), jenisBarang (String), stok (int), 
       - Deklarasi atribut dilakukan pada baris 13 dan 14
hargaSatuan (int)
4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi method dilakukan?
jawab : Terdapat 4 method, yaitu 
-  tampilBarang(): void
   tambahStok(n: int) : void
   kurangiStok(n: int) void
   hitungHargaTotal(jumlah: int) : int
-  Deklarasi method dilakukan pada baris 16,23,27,31
5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)
jawab : void kurangiStok(int n){
        	  if(n>0){
           stok=stok-n;
        }

6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa
bilangan int?
jawab : Method tambahStok() memiliki parameter berupa bilangan int, karena nilai data 
        dari method tambahStok() berupa bilangan bulat.

7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
jawab : Method hitungHargaTotal() memiliki tipe data int, karena nilai data dari method 
        tersebut berupa bilangan bulat
8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?
jawab :Method tambahStok() memiliki tipe data void, karena tidak memiliki nilai data 
       kembalian, akan tetapi jika diperlukan nilai data dikembalikan maka tipe data 
       kembaliaanya harus dicantumkan
## 2.3.3
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek
yang dihasilkan?  
jawab : Instansiasi dilakukan pada baris ke 14, dengan nama objek yang dihasilkan yaitu b1
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
jawab :-Cara mengakses atribut dengan cara menuliskan namaObjek.namaAtribut = nilai;
        Pada kode program diatas dituliskan sebagai berikut 
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
       -Sedangkan untuk mengakses method dengan cara menuliskan 
        namaObjek.namaMethod();
        Pada kode program diatas di tuliskan sebagai berikut 
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);

## 2.4.3
1. Perhatikan class Barang yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi 
konstruktor berparameter dilakukan?  
jawab : pada baris 25
2. Perhatikan class BarangMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris 
program dibawah ini?  
        Barang b2 = new Barang("Logitech", "Wireless Mouse", 150000, 25);
jawab : yaitu melakukan instansiasi konstruktor berparameter dengan nama objek baru yaitu b2

3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class 
Barang.  
jawab : Barang b3 = new Barang("Minyak kayu putih", "Obat", 3, 5000);

    