import java.util.Scanner;
public class PostfixMain {
  public static void main(String[] args) {
    Scanner ds = new Scanner(System.in);
    String P, Q;
    System.out.print("Masukkan ekspresi matematika (infix) : ");
    Q = ds.nextLine();
    Q = Q.trim();
    Q = Q + ")";
    int total = Q.length();
    Postfix post = new Postfix(total);
    P = post.konversi(Q);
    System.out.println("Postfix: " + P);
  }
}
