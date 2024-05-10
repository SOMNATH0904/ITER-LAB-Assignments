import java.util.*;

public class DFS_Graph {
    int count;
    private LinkedList<LinkedList<Edge>> Adj;
    int INF = 9999;

    private static class Edge implements Comparable<Edge> {
        int src, dest, cost;

        public Edge(int s, int d, int c) {
            src = s;
            dest = d;
            cost = c;
        }

        public int compareTo(Edge compareEdge) {
            return this.cost - compareEdge.cost;
        }
    }

    public DFS_Graph(int cnt) {
        count = cnt;
        Adj = new LinkedList<LinkedList<Edge>>();
        for (int i = 0; i < cnt; i++) {
            Adj.add(new LinkedList<Edge>());
        }
    }

    private void addDirectedEdge(int source, int dest, int cost) {
        Edge edge = new Edge(source, dest, cost);
        Adj.get(source).add(edge);
    }

    public void addDirectedEdge(int source, int dest) {
        addDirectedEdge(source, dest, 1);
    }

    public void addUndirectedEdge(int source, int dest, int cost) {
        addDirectedEdge(source, dest, cost);
        addDirectedEdge(dest, source, cost);
    }

    public void addUndirectedEdge(int source, int dest) {
        addUndirectedEdge(source, dest, 1);
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            LinkedList<Edge> ad = Adj.get(i);
            System.out.print("Vertex " + i + " is connected to : ");
            for (Edge adn : ad) {
                System.out.print(adn.dest + "(cost: " + adn.cost + ") ");
            }
            System.out.println();
        }
    }

    public boolean dfs(int source, int target) {
        boolean[] visited = new boolean[count];
        dfsUtil(source, visited);
        return visited[target];
    }

    public void dfsUtil(int index, boolean[] visited) {
        visited[index] = true;
        LinkedList<Edge> adl = Adj.get(index);
        for (Edge adn : adl) {
            if (visited[adn.dest] == false)
                dfsUtil(adn.dest, visited);
        }
    }

    public void printAllPathDFS(boolean[] visited, int source, int dest, Stack<Integer> path) {
        path.push(source);
        if (source == dest) {
            System.out.println(path);
            path.pop();
            return;
        }
        visited[source] = true;
        LinkedList<Edge> adl = Adj.get(source);
        for (Edge adn : adl) {
            if (visited[adn.dest] == false)
                printAllPathDFS(visited, adn.dest, dest, path);
        }
        visited[source] = false;
        path.pop();
    }

    public void printAllPath(int src, int dest) {
        boolean[] visited = new boolean[count];
        Stack<Integer> path = new Stack<Integer>();
        printAllPathDFS(visited, src, dest, path);
    }

    // Testing Code
    public static void main(String[] args) {
        DFS_Graph gph = new DFS_Graph(8);
        gph.addUndirectedEdge(0, 3);
        gph.addUndirectedEdge(0, 2);
        gph.addUndirectedEdge(0, 1);
        gph.addUndirectedEdge(1, 4);
        gph.addUndirectedEdge(2, 5);
        gph.addUndirectedEdge(3, 6);
        gph.addUndirectedEdge(6, 7);
        gph.addUndirectedEdge(5, 7);
        gph.addUndirectedEdge(4, 7);
        gph.print();

        System.out.println("Path between 0 & 6 : " + gph.dfs(0, 6));

        System.out.println("All the DFS Paths present in the Graph are --> ");
        gph.printAllPath(0,6);
    }
}