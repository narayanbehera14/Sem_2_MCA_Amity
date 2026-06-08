import java.util.*;

class Kruskal {

    class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }

    int V, E;
    Edge edge[];

    Kruskal(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; i++)
            edge[i] = new Edge();
    }

    int find(int parent[], int i) {
        if (parent[i] == i)
            return i;
        return find(parent, parent[i]);
    }

    void union(int parent[], int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    void kruskalMST() {

        Edge result[] = new Edge[V];
        for (int i = 0; i < V; i++)
            result[i] = new Edge();

        Arrays.sort(edge);

        int parent[] = new int[V];
        for (int i = 0; i < V; i++)
            parent[i] = i;

        int e = 0;
        int i = 0;

        while (e < V - 1) {

            Edge next = edge[i++];

            int x = find(parent, next.src);
            int y = find(parent, next.dest);

            if (x != y) {
                result[e++] = next;
                union(parent, x, y);
            }
        }

        System.out.println("Edges in MST:");

        for (i = 0; i < e; i++)
            System.out.println(result[i].src + " - " + result[i].dest + " : " + result[i].weight);
    }

    public static void main(String[] args) {

        int V = 4;
        int E = 5;

        Kruskal g = new Kruskal(V, E);

        g.edge[0].src = 0;
        g.edge[0].dest = 1;
        g.edge[0].weight = 10;

        g.edge[1].src = 0;
        g.edge[1].dest = 2;
        g.edge[1].weight = 6;

        g.edge[2].src = 0;
        g.edge[2].dest = 3;
        g.edge[2].weight = 5;

        g.edge[3].src = 1;
        g.edge[3].dest = 3;
        g.edge[3].weight = 15;

        g.edge[4].src = 2;
        g.edge[4].dest = 3;
        g.edge[4].weight = 4;

        g.kruskalMST();
    }
}