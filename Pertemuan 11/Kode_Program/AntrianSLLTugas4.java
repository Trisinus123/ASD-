public class AntrianSLL {

	NodeMhs head, tail ;
	int size = 0 ;

	public boolean isEmpty() {
		return head == null ;
	}
	public void print(Mahasiswa input) {
		System.out.println("NIM \t: " + input.nim ) ;
		System.out.println("Nama \t: " + input.nama ) ;
		System.out.println("Absen \t: " + input.absen ) ;
		System.out.println("IPK \t: " + input.ipk ) ;
		System.out.println("_____________________________________________") ;
	}
	public void printAll() {
		if (!isEmpty()) {
			NodeMhs tmp = head ;
			System.out.println("_____________________________________________") ;
			System.out.println("__________)Mahasiswa dalam Antrian(__________") ;
			System.out.println("Data Mahasiswa : ") ;
			while (tmp != null) {
				print(tmp.data) ;
				tmp = tmp.next ;
			}
		} else {
			System.out.println("Antrian Kosong") ;
		}
	}
	public void enqueue(Mahasiswa input) {
		NodeMhs ndInput = new NodeMhs(input, null) ;
		if (isEmpty()) {
			head = ndInput ;
			tail = ndInput ;
		} else {
			tail.next = ndInput ;
			tail = ndInput ;
		}
		size++ ;
	}
	public void dequeue() {
		Mahasiswa dt = new Mahasiswa() ;
		if (isEmpty()) {
			System.out.println("Antrian Masih Kosong!") ;
		} else {
			dt = head.data ;
			size-- ;
			if (head == tail) {
				head = tail = null ;
			} else {
				head = head.next ;
			}
		}
		System.out.println("Antrian yang Keluar : ") ;
		print(dt) ;
	}
	public void peek() {
		if (isEmpty()) {
			System.out.println("Antrian Masih Kosong!") ;
		} else {
			System.out.println("Mahasiswa Antrian Terdepan : ") ;
			print(head.data) ;
		}
	}
	public void peekRear() {
		if (isEmpty()) {
			System.out.println("Antrian Masih Kosong!") ;
		} else {
			System.out.println("Mahasiswa Antrian Paling Belakang : ") ;
			print(tail.data) ;
		}
	}
	public void peekPosition(String key) {
		NodeMhs tmp = head ;
		int index = 0 ;
		while (tmp != null) {
			if (tmp.data.nim.equals(key)) {
				break ;
			}
			tmp = tmp.next ;
			index++ ;
		}
		if (tmp == null) {
			System.out.println("Mahasiswa Tidak Ditemukan") ;
		} else {
			System.out.println("Mahasiswa dengan NIM : | " + key + " | ") ;
			System.out.println("Berada pada Posisi Antrian Indeks ke-" + index) ;
		}
	}
	public void printMahasiswa(int index) {
		if (isEmpty()) {
			System.out.println("Antrian Masih Kosong") ;
		} else {
			NodeMhs tmp = head ;
			for (int i = 0; i < index; i++) {
				tmp = tmp.next ;
			}
			System.out.println("Mahasiswa pada Antrian Indeks ke-" + index + " : ") ;
			print(tmp.data) ;
		}
	}
}