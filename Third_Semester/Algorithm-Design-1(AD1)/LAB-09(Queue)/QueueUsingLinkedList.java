import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class QueueUsingLinkedList {
    static Node front = null;
    static Node rear = null;

    public static void insert() {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.println("Enter the element : ");
        newNode.data = sc.nextInt();
        newNode.next = null;

        if(rear == null & front == null) {
            rear = front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public static void remove() {
        if(front == null & rear == null) {
            System.out.println("Queue is Empty!");
            return;
        }
        int num = front.data;
        System.out.println(num+" is deleted");
        if(front == rear) {
            rear = null;
        }
        front = front.next;
    }

    public static void display() {
        if(front == null & rear == null) {
            System.out.println("Queue is Empty!");
            return;
        }
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static boolean isEmpty() {
        return rear == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("**** MENU ****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0: System.exit(0);

                case 1: insert();
                        break;

                case 2: remove();
                        break;

                case 3: display();
                        break;

                case 4 :
                    System.out.println("Is the Queue is Empty : "+isEmpty());
                    break;
                   
                default: System.out.println("Wrong Choice!");                
            }
        }
    }
}