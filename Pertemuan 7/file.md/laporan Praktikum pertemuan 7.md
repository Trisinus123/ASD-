##laporan Praktikum pertemuan 7
### Nama  : Trisinus Gulo
### NIM   : 2141720035
### Kelas : TI-1G
### Absen : 28


## **subbab 6.2.1 Langkah-langkah Percobaan Sequential Search**

![Srenshoot](Mahasiswa.png)
![Screnshoot](PencarianMHs.png)
![Screnshoot](PencarianMHs1.png)
![Screnshoot](PencarianMHs2.png)
![Screnshoot](RunMahasiswa.png)
![Screnshoot](RunMahasiwa1.png)

## *** Subbab 6.2.3. Pertanyaan ***

1. Jelaskan perbedaan metod TampilData dan Tampilposisi pada class PencarianMhs
   Tampil data digunakan untuk menampilkan data mahasiswa Tampil proses digunakan untuk menampilkan posisi index yang dicari

2. Jelaskan fungsi break pada kode program dibawah ini!
   Pada array tesebut dengan atribut nim samadengan data yang di cari. Jika data sama dengan 
   posisi berisi j maka pencarian akan berhenti.

4. Jika Data Nim yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat
   berjalan? Apakah hasil yang dikeluarkan benar? Mengapa demikian
   Masih bisa berjalan. Benar tetapi tidak berurutan molai dari yang terkecil hingga yang 
   terbesa

## Subbab  6.3.3. Pertanyaan ***

1. Tunjukkan pada kode program yang mana proses divide dijalankan!

   int mid;
      if(right>=left){
      mid = (left + right)/2;

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
    
   if(cari==listMhs[mid].nim){
   return (mid);
 }else if(listMhs[mid].nim>cari){
   return FindBinarySearch(cari, left, mid -1 );
 }else{
   return FindBinarySearch(cari, mid + 1, right);
 }

3. Jika data Nim yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
   demikian!


4. Jika Nim yang dimasukkan dari NIM terbesar ke terkecil     (missal : 20215, 20214, 20212, 20211,20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakahsesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai

5. Modifikasilah program diatas yang mana jumlah mahasiswa yang di inputkan sesuai dengan masukan dari keyboard.

## **Subbab 6.4. Percobaan Pengayaan Divide and Conquer**

![Screnshoot](MergeSort.png)
![Screnshoot](SortMain.png)
![Screnshoot](RunSort.png)


## **Subabb 6.5. Latihan Praktikum**

1. Tugas 1

![Screnshoot](MahasiswaTugas1.png)
![Screnshoot](PencarianMHsTugas1.png)
![Screnshoot](PencarianMHs1RTugas1.png)
![Screnshoot](PencarianMHs2Tugas1.png)
![Screnshoot](MainMhsTugas1.png)
![Screnshoot](Run1MhsTugas1.png)
![Screnshoot](Run1MhsTugas1.png)
![Screnshoot](Run2MhsTugas1.png)

2. Tugas 2

![Screnshoot](MahasiswaTugas2.java.png)
![Screnshoot](PencarianMhsTugas2.png)
![Screnshoot](Pencarian1MhsTugas2.png)
![Screnshoot](MainMHsTugas2.png)
![Screnshoot](RunMhsTugas2.png)
![Screnshoot](Run1MhsTugas2.png)

3. Tugas3

![Screnshoot](Tugas3.png)
![Screnshoot](Tugas3Main.png)
![Screnshoot](RunTugas3.png)