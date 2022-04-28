##laporan Praktikum pertemuan 3
### Nama  : Trisinus Gulo
### NIM   : 2141720035
### Kelas : TI-1G
### Absen : 28

### **SubBab 3.2**
1.Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!  
    **Menurut saya harus memiliki atribut tetapi tidak harus memiliki method karena pada 3.2 kita harus
    memasukkan panjang dan lebar yang dimana itu adalah atribut dari objek tersebut, dan juga method digunakan jika perlu jika tidak maka tidak perlu di tuliskan**

2. Apakah class PersegiPanjang memiliki konstruktor? 
Jika tidak, kenapa dilakukan pemanggilan 
konstruktur pada baris program berikut :  
    **Untuk membuat objek PersegiPanjang ke index array 1** 

3. Apa yang dimaksud dengan kode berikut ini:  
    **Untuk membuat ppArray menampung 3 objek PersegiPanjang** 

4. Apa yang dimaksud dengan kode berikut ini: 
    **Untuk instansiasi objek, membuat objek PersegiPanjang  ke index array 1
    dan mengisi atribut array index 1 berupa panjang = 80 dan lebar = 40** 
   
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
    **Agar lebih fleksibel dan mencerminkan class dan objek itu sendiri**  
     ![Screnshot](Tangkapanlayarpersegipanjang.png)
     ![Screnshoot](tangkapanlayarpersegipanjangmain.png)
    

# **SubBab 3.3**

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?  
    **Bisa**  

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
     ``` java
     barang[][] b = new barang[1][1];
     b[0][0] = new barang();
     ```  

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa?  
    **Karena belum membuat objek pada index array 5. Seharusnya setelah line 1 ada
    line seperti berikut :**  

    ``` java
    pgArray[5] = new Persegi();
    ```  

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!  
![Screnshoot](persegipanjangmain.png)

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !  
    **Boleh, akan tetapi lebih efisien jika instansi dilakukan sekali saja**  

## **SubBab 3.4**  

1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!   
    **Dapat**  
    ``` java
    public class Film{
        int season;
        public Film(){
        }
        public Film(int f) {
            season = s;
        }
    }
    ```
    **Contoh tersebut adalah konstruktor tidak berparameter dan konstruktor berparameter**  

2. Jika diketahui terdapat class Segitiga seperti berikut ini:  
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.  
![Srenshoot](segitiga.png)

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut.
![Screnshoot](segitigaMain.png)

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut:  
sgArray ke-0 alas: 12, tinggi: 3  
sgArray ke-1 alas: 40, tinggi: 10  
sgArray ke-2 alas: 14, tinggi: 6  
sgArray ke-3 alas: 28, tinggi: 10  
![Screnshoot](Tangkapanlayarsegitigamain1.png)
)
  
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling().  
![Srenshoot](Tangkapanlayarsegitigamain2.png)

## **SubBab 3.5**  

1. Latihan 1
   
   ![Srenshoot](balok.png)
   ![Screnshoot](tabung.png)
   ![Screnshoot](bola.png)
   ![Screnshoot](Runbangunmain.png)

2. Latihan 2

   ![Screnshoot](tanah.png)
   ![Screnshoot](tanahMain.png)

3. Latihan 3
 
   ![Screnshoot](mahasiswa.png)
   ![Screnshoot](mahasiswamain.png)

   



   )

