public class Tugas2 {
    String nim, nama;
    int absen;
    double ipk;

    Tugas2(String nim, String nama, int absen, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }
    int max, size, front, rear;
    Tugas2[] Q;

    public Tugas2(int n){
        max = n;
        Create();
    }
    public void Create(){
        Q = new Tugas2 [max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        if(size == 0){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull(){
        if(size == max){
            return true;
        } else {
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan :     " + Q[front].nim + "     " + Q[front].nama + "     " + Q[front].absen + "     " + Q[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen paling belakang :     "+Q[rear].nim + "     " + Q[rear].nama + "     " + Q[rear].absen + "     " + Q[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i != rear){
                System.out.print(Q[i].nim + "     " + Q[i].nama + "     " + Q[i].absen + "     " + Q[i].ipk+"\n");
                i = (i+1) % max;
            }
            System.out.println(Q[i].nim + "     " + Q[i].nama + "     " + Q[i].absen + "     " + Q[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
    public void Enqueue(Tugas2 data){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if(IsEmpty()){
                front = rear = 0;
            } else {
                if(rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
    public Tugas2 Dequeue(){
        Tugas2 data = new Tugas2("","",0,0);
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            } else {
                if(front == max - 1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    public void peekPosition(String nim){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int counter = 0;
            int i = front;
            while(i != rear){
                if(Q[i].nim.equals(nim)){
                    System.out.println("Data :\t"+Q[i].nim + "      " + Q[i].nama + "      " + Q[i].absen + "      " + Q[i].ipk+"     terletak pada indeks-"+i);
                    counter++;
                }
                i = (i+1) % max;
            }
            if(counter!=1){
                System.out.println("Data :\t"+Q[i].nim + "        " + Q[i].nama + "        " + Q[i].absen + "        " + Q[i].ipk+"     terletak pada indeks-"+i);
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
    }
    public void printMahasiswa(int posisi){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int counter = 0;
            int i = front;
            while(i != rear){
                if(i == posisi){
                    System.out.println("Pada indeks-"+i+" terdapat data :\t"+Q[i].nim + "        " + Q[i].nama + "        " + Q[i].absen + "        " + Q[i].ipk);
                    counter++;
                }
                i = (i+1) % max;
            }
            if(counter!=1){
                System.out.println("Pada indeks-"+i+" terdapat data :\t"+Q[i].nim + "        " + Q[i].nama + "        " + Q[i].absen + "        " + Q[i].ipk);
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
    }
}
