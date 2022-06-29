import java.util.Scanner;
public class GraphTugas1 {
  int vertex;
  LinkedList list[];

  public GraphTugas1(int vertex){
    this.vertex = vertex;
    list = new LinkedList[vertex];
    for(int i = 0; i < vertex; i++){
      list[i] = new LinkedList();
    }
  }
  public void addEdge(int source, int destination){
 //add edge
  list[source].addFirst(destination);

 //add back edge for udirected
  list[destination].addFirst(source);
  }
  public void degree(int source) throws Exception{
 //degree undirected graph
  System.out.println("Degree vertex "+source+" : "+list[source].size());

 //degree directed graph
 //indegree
  int k, totalIn = 0, totalOut = 0;
  for (int i = 0; i < vertex; i++){
    for(int j = 0; j < list[i].size(); j++){
      if(list[i].get(j)==source)
      ++totalIn;
    }
 //outdegree
  for (k = 0; k < list[source].size(); k++){
    list[source].get(k);
  }
    totalOut = k;
  }
  System.out.println("Indegree dari vertex "+source+" : "+totalIn);
  System.out.println("Outdegree dari vertex "+source+" : "+totalOut);
  System.out.println("Degree vertex "+source+" : "+(totalIn+totalOut));
  }
  public void removeEdge(int source, int destination) throws Exception{
    for (int i = 0; i < vertex; i++){
      if (i==destination){
        list[source].remove(destination);
      }
    }
  }
  public void removeAllEdges(){
    for (int i = 0; i < vertex; i++){
      list[i].clear();
    }
    System.out.println("Graph berhasil dikosongkan");
  }
    public void printGraph() throws Exception{
      for ( int i = 0; i < vertex; i++){
        if(list[i].size() > 0){
          System.out.print("Vertex "+i+" terhubung dengan : ");
          for (int j = 0; j < list[i].size(); j++){
            System.out.print(list[i].get(j)+" ");
          }
          System.out.println("");
        }
      }
      System.out.println("");
    }
    public static void main(String[] args) throws Exception{
    int count = 1, to, from, pilih;
        Scanner sc = new Scanner(System.in);
        GraphTugas1 graph1 = new GraphTugas1(6);

        System.out.println("\n Trisinus Gulo");
        System.out.println(" 2141720035");
        System.out.println(" TI-1G");

        System.out.print("\n Masukkan jumlah inputan lintasan : ");
        int jumlah = sc.nextInt();
        System.out.println(" ------------------------------------");
        System.out.println(" Masukkan edges: ");
        while (count <= jumlah) {
            to =   sc.nextInt();
            from = sc.nextInt();
            graph1.addEdge(to, from);
            count++;
        }
        System.out.println("");
        graph1.printGraph();
        graph1.degree(2);
        graph1.removeEdge(1, 2);
        graph1.printGraph();
    }
}
