##laporan Praktikum Pertemuan 14
### Nama  : Trisinus Gulo
### NIM   : 2141720035
### Kelas : TI-1G
### Absen : 28

## **Praktikum1**

![Screnshot](Tangkapanlayar1.png)
![Screnshot](Tangkapanlayar2.png)
![Screnshot](Tangkapanlayar3.png)
![Screnshot](Tangkapanlayar4.png)
![SCrenshot](Tangkapanlayar5.png)
![Screnshot](Tangkapanlayar6.png)
![Screnshot](Tangkapanlayar7.png)
![Screnshot](Tangkapanlayar8.png)
![Screnshot](TangkapanlayarHasilRun1prak1.png)
![Screnshot](TangkapanlayarHasilRun2prak1.png)

## **Pertanyaan Praktikum1**

1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah kegunaan algoritma-algoritma tersebut?
   
   jawab:

    - Algoritma Brent untuk menentukan adanya daur ulang dalamgraf

    - Algoritma Hungaria untuk penjodohan sempurna

    - Algoritma Hopcroft-Karp untuk menemukan pernjodohan maksimum

2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan embuatan variabel tersebut ? 
   
   jawab:

   - untuk mengisi vertek, sedangkan dibuat tipe data 
    LinkedList untuk nanti diisikan keterangan edge.

   - Untuk memanggil objek Linkedlist dan mengubahnya menjadi   objek array yang mana nantinya akan di isi oleh vertex.

3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?
   
   jawab:

   Alasan pemanggilan metode addFirst () untuk menambah data yang dimulai dari awal untuk menghubungkan vertex dengan koneksinya. Apabila menggunakan add() tidak dapat memanggil karena metode tersebut menginputkan nilai dengan menyesuaikan indeks. Dan apabila menggunakan method addlast() Maka hasilnya tidak sesuai karena penginputan nilainya dari belakang.

4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge pada graph ?
   
   jawab:

   - Ketika eksekusi kode program pada baris i==destination, maka dapat dilihat source dari i tersebut.

   - Dengan cara looping edge, jika vertex lebih besar dari I dan destination sama dengan I maka edge akan otomatis di hapus


5. Kenapa pada praktikum 2.1.1 langkah ke-12 untuk menghapus path yang bukan merupakan lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?

         graph.removeEdge(1,3);

           graph.printGraph();

    jawab:

    Output tidak error namun data vertex yang dilewati mengalami perubahan lintasan.


## **Praktikum2**

![Screnshot](Tangkapanlayar9.png)
![Screnshot](Tangkapanlayar10.png)
![Screnshot](TangkapanlayarHasilRunprak2.png)
 
## **Pertanyaan Praktikum2**

1. Apakah perbedaan degree/derajat pada directed dan undirected graph?

    jawab:

    - Degree pada directed graph tidak sama dan tidak selalu berhubungan kembali, sedangkan jika degree pada undirected graph degree sama dan pasti berhubungan kembali

    - Directed gaph degree mempunyai nilai yang berbeda karena terdapat in outSedangkan undirected degree mempunyai nilai yang sama karena tidak terdapat in out

2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus ditambahkan dengan 1 pada indeks array berikut?

     
        public GraphArray(int v){

        vertices = v;

        twoD_array = new int[vertices+1][vertices+1];

       }

    jawab:

     Karena array dimulai dari 0, sedangkan untuk print dibutuhkan 7 baris dan 7 kolom masing2 0 dai paling kiri dan paling atas, maka dari yang 6 + 1 menjadi 7 dan juga Karena pada matriks index di mulai dari 0, agar vertex dalam matrix bernilai sama dengan vertex yang seharusnya maka harus di tambah +1.

3. Apakah kegunaan method getEdge() ?

   jawab:

   Untuk melakukan pencarian dan mengeluarkan output keterangan apakah edge yang dicari itu terdapat dalam graph

4. Termasuk jenis graph apakah uji coba pada praktikum 2.2?

    jawab:

    Termasuk jenis directed graph

5. Mengapa pada method main harus menggunakan try-catch Exception?

   jawab:

   Agar jika terjadi error tidak memberhentikan program yang sedang berjalan


## **TUGAS PRAKTIKUM**

1. Ubahlah lintasan pada praktikum 2.1 menjadi inputan!

        cat : • Coding Node.java(tetap)

         • Coding LinkedList.java(tetap)

         • Coding graph.java

   ![Screnshot](Tangkapanlayar11.png)
   ![Screnshot](Tangkapanlayar12.png)
   ![Screnshot](Tangkapanlayar13.png)
   ![Screnshot](RunTugas1.png)

2. Tambahkan method graphType dengan tipe boolean yang akan membedakan graph termasuk directed atau undirected graph. Kemudian update seluruh method yang berelasi dengan method 
graphType tersebut (hanya menjalankan statement sesuai dengan jenis graph) pada praktikum 2.1

   cat : • Coding Node.java(tetap)

         • Coding LinkedList.java(tetap)

         • Coding graph.java
    

   ![Screnshot](Tangkapanlayar14.png)
   ![Screnshot](Tangkapanlayar15.png)
   ![Screnshot](Tangkapanlayar16.png)
   ![Screnshot](Run1Tugas2.png)
   ![Screnshot](Run2Tugas2.png)

3. Modifikasi method removeEdge() pada praktikum 2.1 agar tidak menghasilkan output yang salah untuk path selain path pertama kali!

    cat : • Coding Node.java(tetap)

         • Coding LinkedList.java(tetap)

         • Coding graph.java

    
    ![Screnshot](Tangkapanlayar17.png)
    ![Screnshot](Tangkapanlayar18.png)
    ![Screnshot](Tangkapanlayar19.png)
    ![Screnshot](RunTugas3.png)

4. Ubahlah tipe data vertex pada seluruh graph pada praktikum 2.1 dan 2.2 dari Integer menjadi tipe generic agar dapat menerima semua tipe data dasar Java! Misalnya setiap vertex yang awalnya berupa angka 0,1,2,3, dst. selanjutnya ubah menjadi suatu nama daerah seperti Gresik, Bandung, Yogya, Malang, dst.

   ![Screnshot](Tangkapanlayar20.png)
   ![Screnshot](Tangkapanlayar21.png)
   ![Screnshot](Tangkapanlayar22.png)
   ![Screnshot](Tangkapanlayar23.png)
   ![Screnshot](Tangkapanlayar24.png)
   ![Screnshot](Tangkapanlayar25.png)
   ![Screnshot](Tangkapanlayar26.png)
   ![Screnshot](Run1Tugas4.png)
   ![Screnshot](Run2Tugas4.png)



