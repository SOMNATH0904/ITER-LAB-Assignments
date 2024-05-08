/**
 * Ques 10 : Write a Java program to traverse a graph using breadth-first search (BFS) and provide the final output of the code. (Use the ArrayDeque collection.)
 */

/**
 * CODE
 */

import java.util.*;

class Graph2 {
    private LinkedList<Integer>[] adjacencyList;
    private int numVertices;

    public Graph2(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjacencyList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        int numVertices = 5;
        Graph2 graph = new Graph2(numVertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Breadth-First Search (BFS):");
        graph.bfs(0);
    }
}

/**
 * OUTPUT
 * 
 * Breadth-First Search (BFS):
 * 0 1 2 3 4 
 */