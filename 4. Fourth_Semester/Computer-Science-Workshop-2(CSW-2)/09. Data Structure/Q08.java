/**
 * Ques 8 : Write a program to implement the graph using adjacency matrix representation and adjacency list representation. Create methods to display the adjacency matrix and adjacency list of the graph.
 */

/**
 * CODE
 */

import java.util.*;

class Graph {
    private int[][] adjacencyMatrix;
    private LinkedList<Integer>[] adjacencyList;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
        adjacencyList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyMatrix[src][dest] = 1;
        adjacencyMatrix[dest][src] = 1;

        adjacencyList[src].add(dest);
        adjacencyList[dest].add(src);
    }

    public void displayAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjacencyList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class Q08 {
    public static void main(String[] args) {
        int numVertices = 5;
        Graph graph = new Graph(numVertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.displayAdjacencyMatrix();
        graph.displayAdjacencyList();
    }
}

/**
 * OUTPUT
 * 
 * Adjacency Matrix:
 * 0 1 1 0 0 
 * 1 0 0 1 0 
 * 1 0 0 0 1 
 * 0 1 0 0 0 
 * 0 0 1 0 0 
 * Adjacency List:
 * 0 -> 1 2 
 * 1 -> 0 3 
 * 2 -> 0 4 
 * 3 -> 1 
 * 4 -> 2 
 */