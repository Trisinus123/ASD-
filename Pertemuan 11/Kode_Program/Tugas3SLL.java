class Tugas3SLL {
    Tugas3Node head, tail;

    public boolean isEmpty(){
        return tail==null;
    }
    public void print(){
        if(!isEmpty()){
            Tugas3Node tmp=head;
            System.out.println("DAFTAR BUKU : ");
            while (tmp!=null){
                System.out.println(tmp.judul);
                tmp=tmp.next;
            }
            System.out.println("");
        } else{
            System.out.println("Linked List kosong");
        }
    }
    public void addFirst(String input){
        Tugas3Node ndInput=new Tugas3Node(input,null);
        if(isEmpty()){
            head=tail=ndInput;
        } else{
            ndInput.next=head;
            head=ndInput;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head==tail) {
            head=tail=null;
        } else{
            head=head.next;
        }
    }
    public void getDataTop(){
        Tugas3Node tmp=head;
        System.out.println("Elemen teratas : " + tmp.judul);
    }
}
