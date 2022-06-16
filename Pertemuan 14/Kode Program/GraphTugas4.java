import java.util.Scanner;

public class Graph<T> {
    int vertex;
    boolean tipe;
    LinkedLists list[];

    public Graph(int vertex, boolean tipe) {
        this.vertex = vertex;
        this.tipe = tipe;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedLists();
        }
    }

    public void addEdge(int a, int b, String source, String destination) {
        if (graphType(tipe)) {
            list[a].addFirst(destination);
        } else {
            list[a].addFirst(destination);
            list[b].addFirst(source);
        }
    }

    public void degree(int source) throws Exception {
        if(tipe==true){
        System.out.println("degree vertex " + source + " : " + list[source].size());
        
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                list[i].get(j);
            }
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree dari vertex " + source + " : " + (totalIn + totalOut));
        } else {
            System.out.println("degree vertex " + source + " : " + list[source].size()); 
        }
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < list[source].size(); i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public boolean graphType(boolean tipe) {
        return tipe;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean tp;
        System.out.print("Tipe vertex?\n1. directed\n2. undirected\njawab: ");
        int p = sc.nextInt();
        if (p == 1) {
            tp = true;
        } else {
            tp = false;
        }
        Graph graph = new Graph(6, tp);
        System.out.println("Masukkan vertex <source> <destination> <kota source> <kota destination>");
        
        graph.addEdge(0, 1, "kediri", "malang");
        graph.addEdge(0, 2, "kediri", "blitar");
        graph.addEdge(0, 3, "kediri", "surabaya");
        graph.addEdge(0, 4, "kediri", "Nias");
        graph.addEdge(2, 1, "blitar", "malang");
        graph.addEdge(3, 1, "surabaya", "malang");
        graph.addEdge(4, 1, "Nias", "malang");
        /*
         * graph.addEdge(0, 1);
         * graph.addEdge(0, 4);
         * graph.addEdge(1, 2);
         * graph.addEdge(1, 3);
         * graph.addEdge(1, 4);
         * graph.addEdge(2, 3);
         * graph.addEdge(3, 4);
         * graph.addEdge(3, 0);
         */

         /*
         0 = kediri
         1 = malang
         2 = blitar
         3 = surabaya
         4 = Nias
         */
        
        graph.printGraph();
        graph.degree(2);
    }
}