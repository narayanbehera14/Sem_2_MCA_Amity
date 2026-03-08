import java.util.*;

class GraphDFS {

    int V;
    LinkedList<Integer> adj[];

    GraphDFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<Integer>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        GraphDFS g = new GraphDFS(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("Depth First Search:");
        g.DFS(0);
    }
}