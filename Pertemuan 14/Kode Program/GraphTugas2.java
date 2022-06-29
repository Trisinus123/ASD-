import java.util.Scanner;

public class GraphTugas2{
    int vertex;
    LinkedList list[];

    public GraphTugas2(int vertex, boolean typeGraph){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for(int i = 0; i < vertex; i++){
            list[i] = new LinkedList();
        }
    }
    public void addEdge(int source, int destination){
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }
    public void degree(int source) throws Exception{
        System.out.println("Degree vertex "+source+" : "+list[source].size());

        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++){
            for(int j = 0; j < list[i].size(); j++){
                if(list[i].get(j)==source)
                    ++totalIn;
            }

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
    boolean graphType(boolean pilih){
        return pilih;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int a = 1, to, from;

        System.out.println("\n Trisinus Gulo");
        System.out.println(" 2041720035");
        System.out.println(" TI-1G");

        boolean type;
        System.out.println("\nPilih Jenis Graph");
        System.out.println("1. Directed");
        System.out.println("2. Undirected");
        System.out.print("\nPilih 1/2 jenis graph : ");
        int pilih = sc.nextInt();
        if(pilih==1){
            System.out.println("Menggunakan directed");
            type = true;
        } else {
            System.out.println("Menggunakan undirected");
            type = false;
        }
        System.out.println("");

        GraphTugas2 graph2 = new GraphTugas2(6,type);
        System.out.print("Masukkan jumlah inputan lintasan : ");
        int jumlah = sc.nextInt();
        System.out.println("------------------------------------");
        System.out.println("Masukkan edges: ");
        while (a <= jumlah) {
            to = sc.nextInt();
            from = sc.nextInt();
            graph2.addEdge(to, from);
            a++;
        }
        System.out.println("");
        graph2.printGraph();
        graph2.degree(2);
        graph2.removeEdge(1, 2);
        System.out.println("");
        graph2.printGraph();
    }
}
