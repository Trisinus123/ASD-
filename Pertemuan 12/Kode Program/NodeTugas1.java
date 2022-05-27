public class Node {
	 String no, nama;
	 Node prev, next;

	 public Node(Node prev, String no, String nama, Node next) {
	 this.prev = prev;
	 this.no = no;
	 this.nama = nama;
	 this.next = next;
	 }
 }