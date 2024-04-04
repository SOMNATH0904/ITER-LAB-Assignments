/**
 * Ques 2 : Write a Java Program to implement Huffman Coding.
 */

/**
 * ALGORITHM
 * 
 * // Computes optimal prefix code.
 * // Input: List W of character probabilities
 * // Output: The Huffman tree.
 * 
 * function Huffman(C[0..n-1], W[0..n-1]) 
 *      PQ = {}  // priority queue
 *      for i = 0 to n-1 do 
 *          T.char = C[i] 
 *          T.weight = w[i] 
 *          add T to priority queue PQ
 * 
 *      for i = 0 to n-2 do
 *          L = remove min from PQ
 *          R = remove min from PQ
 *          T = node with children L and R 
 *          T.weight = L.weight + R.weight \
 *          add T to priority queue PQ
 *      return T
 */

/**
 * CODE
 */

import java.util.PriorityQueue;

public class HuffmanCoding {
    Node root = null;

    class Node implements Comparable<Node> {
        char c;
        int freq;
        Node left;
        Node right;

        Node(char ch, int fr, Node l, Node r) {
            c = ch;
            freq = fr;
            left = l;
            right = r;
        }

        public int compareTo(Node n2) {
            return this.freq - n2.freq;
        }
    }

    HuffmanCoding(char[] arr, int[] freq) {
        int n = arr.length;
        PriorityQueue<Node> que = new PriorityQueue<Node>(n);

        for(int i = 0; i < n; i++) {
            Node node = new Node(arr[i], freq[i], null, null);
            que.add(node);
        }

        while(que.size() > 1) {
            Node lt = que.peek();
            que.poll();
            Node rt = que.peek();
            que.poll();

            Node nd = new Node('+', lt.freq + rt.freq, lt, rt);
            que.add(nd);
        }
        root = que.peek();
    }

    private void print(Node root, String s) {
        if (root.left == null && root.right == null && root.c != '+') {
            System.out.println(root.c + " : " + s);
            return;
        }
        print(root.left,s + "0");
        print(root.right, s + "1") ;
    }

    public void print() {
        System.out.println("Char = Huffman code");
        print(root, "");
    }

    public static void main(String[] args) {
        char[] ar = { 'A', 'B', 'C', 'D', 'E' };
        int[] fr = { 30, 25, 21, 14, 10 };
        HuffmanCoding hf = new HuffmanCoding(ar, fr);
        hf.print();
    }
}

/**
 * OUTPUT
 * 
 * Char = Huffman code
 * C : 00
 * E : 010
 * D : 011
 * B : 10
 * A : 11
 */