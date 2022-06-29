public class databelanja {
String notrank, tanggal;
int jB, tB;

	 databelanja (String nt, String tgl, int jb, int tb){
	 notrank = nt;
	 tanggal = tgl;
	 jB = jb;
	 tB = tb;
 }

 int size, top;
 databelanja data[];

	 public databelanja(int size) {
	 this.size = size;
	 data = new databelanja [size];
	top = -1;
 }


	 public boolean IsEmpty() {
	 if (top == -1) {
	 return true;
	 } else {
	 return false;
   }
 }

	 public boolean IsFull() {
	 if (top == size - 1) {
	 return true;
	 } else {
	 return false;
   }
 }

	 public void push(databelanja dt) {
	 if (!IsFull()) {
	 top++;
	 data[top] = dt;
	 } else {
	 System.out.println("Isi stack penuh!");
   }
 }

	 public void pop() {
	 if (!IsEmpty()) {
	 databelanja x = data[top];
	 top--;
	 System.out.println("Data yang keluar : " + x.notrank + " || " +x.tanggal + " || " + x.jB + " || " + x.tB);
	 } else {
	 System.out.println("Stack masih kosong");
   }
 }

	 public void peek() {
	 System.out.println("Elemen teratas : " + data[top].notrank + " || " + data[top].tanggal + " || " + data[top].
	jB + " || " +data[top].tB);
}

	 public void print(){
	 System.out.println("-------------------------------------------------");
	 System.out.println("No.transaksi || tgl.pembelian || jumlah || total");
	 System.out.println("-------------------------------------------------");
	 for (int i = top; i >= 0; i--) {
	 System.out.println(data[i].notrank + " || " + data[i].tanggal+ " || " + data[i].jB + " || " +data[i].tB + " ");
 }
	 System.out.println("");
 }

	 public void clear (){
	 if (!IsEmpty()){
	 for (int i = top; i >= 0; i--) {
	 top--;
 }
	 System.out.println("Stack sudah dikosongkan");
	 } else{
	 System.out.println("Gagal! Stack masih kosong");
   }
 }
}
