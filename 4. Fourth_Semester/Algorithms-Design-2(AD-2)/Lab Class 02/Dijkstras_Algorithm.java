import java.util.*;

public class Dijkstras_Algorithm {
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

    public Dijkstras_Algorithm(int cnt) {
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

    String printPathUtil(int[] previous, int source, int dest) {
        String path = "";
        if (dest == source)
            path += source;
        else {
            path += printPathUtil(previous, source, previous[dest]);
            path += ("->" + dest);
        }
        return path;
    }

    public void printPath(int[] previous, int[] dist, int count, int source) {
        String output = "Shortest Paths: ";
        for (int i = 0; i < count; i++) {
            if (dist[i] == 99999)
                output += ("(" + source + "->" + i + " @ Unreachable) ");
            else if (i != previous[i]) {
                output += "(";
                output += printPathUtil(previous, source, i);
                output += (" @ " + dist[i] + ") ");
            }
        }
        System.out.println(output);
    }

    public void dijkstra(int source) {
        int[] previous = new int[count];
        int[] dist = new int[count];
        boolean[] visited = new boolean[count];

        Arrays.fill(previous, -1);
        Arrays.fill(dist, 99999); // infinite

        dist[source] = 0;
        previous[source] = source;

        PriorityQueue<Edge> queue = new PriorityQueue<Edge>(100);
        Edge edge = new Edge(source, source, 0);
        queue.add(edge);
        int curr;

        while (queue.isEmpty() != true) {
            edge = queue.peek();
            queue.remove();
            curr = edge.dest;
            visited[curr] = true;
            LinkedList<Edge> adl = Adj.get(curr);

            for (Edge adn : adl) {
                int dest = adn.dest;
                int alt = adn.cost + dist[curr];

                if (alt < dist[dest] && visited[dest] == false) {
                    dist[dest] = alt;
                    previous[dest] = curr;
                    edge = new Edge(curr, dest, alt);
                    queue.add(edge);
                }
            }
        }
        printPath(previous, dist, count, source);
    }

    // Testing Code
    public static void main(String[] args) {
        Dijkstras_Algorithm gph = new Dijkstras_Algorithm(9);
        gph.addUndirectedEdge(0, 1, 4);
        gph.addUndirectedEdge(0, 7, 8);
        gph.addUndirectedEdge(1, 2, 8);
        gph.addUndirectedEdge(1, 7, 11);
        gph.addUndirectedEdge(2, 3, 7);
        gph.addUndirectedEdge(2, 8, 2);
        gph.addUndirectedEdge(2, 5, 4);
        gph.addUndirectedEdge(3, 4, 9);
        gph.addUndirectedEdge(3, 5, 14);
        gph.addUndirectedEdge(4, 5, 10);
        gph.addUndirectedEdge(5, 6, 2);
        gph.addUndirectedEdge(6, 7, 1);
        gph.addUndirectedEdge(6, 8, 6);
        gph.addUndirectedEdge(7, 8, 7);
        System.out.println();
        gph.dijkstra(0);
    }
}