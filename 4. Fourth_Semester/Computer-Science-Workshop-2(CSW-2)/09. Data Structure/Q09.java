/**
 * Ques 9 : Create a class Graph with a linked list member to represent N number of vertices. Implement the required constructor. Add a method to the Graph class for reading a graph and storing it in an adjacency list representation.
 * Include a depth-first search (DFS) method in the Graph class to traverse the vertices of the graph, and a main method to invoke all the methods.
 */

/**
 * CODE
 */

import java.util.*;

class Graph1 {
    private LinkedList<Integer>[] adjacencyList;
    private int numVertices;

    public Graph1(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[numVertices];
        dfsUtil(start, visited);
    }

    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList[vertex]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }
}

public class Q09 {
    public static void main(String[] args) {
        int numVertices = 5;
        Graph1 graph = new Graph1(numVertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Depth-First Search (DFS):");
        graph.dfs(0);
    }
}

/**
 * OUTPUT
 * 
 * Depth-First Search (DFS):
 * 0 1 3 2 4 
 */