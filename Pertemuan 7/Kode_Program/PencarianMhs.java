class PencarianMhs {
	Mahasiswa[] listMhs;
	int idx;

	PencarianMhs(int x) {
		listMhs = new Mahasiswa[x];
	}

	void tambah(Mahasiswa m) {
		if (idx < listMhs.length) {
			listMhs[idx] = m; 
			idx++;
		} else {
			System.out.println("Data sudah penuh !! ");
		}
	}

	void tampil(){
		for (Mahasiswa m:listMhs) {
			m.tampil();
			System.out.println("----------------------");
		}
	}

	int findSeqSearch(int cari) {
		int posisi = -1;
		for (int i = 0; i < listMhs.length; i++) {
			if (listMhs[i].nim == cari) {
				posisi = i;
				break;
			}
		}
		return posisi;
	}

	int findBinarySearch(int cari, int left, int right) {
		int mid;
		if (right >= left) {
			mid = (left + right) / 2;
			if (cari == listMhs[mid].nim) {
				return (mid);
			} else if (listMhs[mid].nim > cari) {
				return findBinarySearch(cari, left, mid - 1);
			} else {
				return findBinarySearch(cari, mid + 1, right);
			}
		}
		return -1;
	}

	void insertionSort() {
		for (int i = 1; i < listMhs.length; i++) {
			Mahasiswa tmp = listMhs[i];
			int j = i;
			while (j > 0 && listMhs[j-1].nim > tmp.nim) {
				listMhs[j] = listMhs[j-1];
				j--;
			}
			listMhs[j] = tmp;
		}
	}

	void tampilPosisi(int x, int pos) {
		if (pos != -1) {
			System.out.println("data : " + x + " ditemukan pada indeks " + pos); 
		} else {
			System.out.println("data " + x + " tidak ditemukan");
		}
	}

	void tampilData(int x, int pos) {
		if (pos != -1) {
			System.out.println("Nim : " + x);
			System.out.println("Nama : " + listMhs[pos].nama);
			System.out.println("Umur : " + listMhs[pos].umur); 
			System.out.println("IPK : " + listMhs[pos].ipk);
		} else {
			System.out.println("data " + x + " tidak ditemukan ");
		}
	}
}
