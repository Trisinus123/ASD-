public class SLLmain{
  public static void main(String[] args) {
    SingleLinkedList singLL = new SingleLinkedList();
    singLL.print();
    singLL.addFirst(890);
    singLL.print();
    singLL.addLast(760);
    singLL.print();
    singLL.insertBefore(760,700);
    singLL.print();
    singLL.insertAfter(700,999);
    singLL.print();
    singLL.insertAt(3,833);
    singLL.print();

    System.out.println("Data Pada Indeks Ke-1 = "+singLL.getData(1));
    System.out.println("Data 3 Berada Pada Indeks Ke-"+singLL.indexOf(760));

    singLL.remove(999);
    singLL.print();
    singLL.removeAt(0);
    singLL.print();
    singLL.removeFirst();
    singLL.print();
    singLL.removeLast();
    singLL.print();
  }
}
