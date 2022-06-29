public class Tugas2Main {
    public static void main(String[] args) {
        Tugas2SLL singLL = new Tugas2SLL();

        singLL.print();
        singLL.addFirst('A');
        singLL.print();
        singLL.addLast('E');
        singLL.print();
        singLL.insertAfter('A', 'B');
        singLL.print();
        singLL.insertAt(2, 'C');
        singLL.print();
        singLL.insertAfter('C', 'D');
        singLL.print();
    }
}
