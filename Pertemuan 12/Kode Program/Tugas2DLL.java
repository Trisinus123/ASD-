class Tugas2DLL {

    Node head;
    int size;

    public Tugas2DLL() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(String id, String judul, double rating) {
        if (isEmpty()) {
            head = new Node(null, id, judul, rating, null);
        } else {
            Node newNode = new Node(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(String id, String judul, double rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks Di Luar Batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, id, judul, rating, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, id, judul, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size() {
        return size;
    }
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("id\t: "+tmp.id);
                System.out.println("judul\t: "+tmp.judul);
                System.out.println("rating\t: "+tmp.rating);
                tmp = tmp.next;
            }
            System.out.println("semua data berhasil dicetak");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Indeks Di Luar Batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void search(String id)throws Exception{
        int i=0;
        boolean flag=false;
        Node current=head;
        if(head==null){
            System.out.println("List masih kosong!");
            return;
        }
        while(current!=null){
            if(current.id.equalsIgnoreCase(id)){
                flag=true;
                break;
            }
            current=current.next;
            i++;
        }
        if(flag){
            System.out.println("Data "+id+" berada di node ke-"+i);
            System.out.println("IDENTITAS :");
            System.out.println("id\t: "+current.id);
            System.out.println("judul\t: "+current.judul);
            System.out.println("rating\t: "+current.rating);
        } else{
            System.out.println("Data tidak ditemukan!");
        }
    }
    public void bubbleSort()throws Exception{
        Node current=null, idx=null;
        Node tmp;
        if(head==null){
            return;
        } else{
            for(current=head; current.next!=null; current=current.next){
                for(idx=current.next; idx!=null; idx=idx.next){
                    if(current.rating<idx.rating){
                        tmp=current;
                        current=idx;
                        idx=tmp;
                    }
                }
            }
        }
        print();
    }
}