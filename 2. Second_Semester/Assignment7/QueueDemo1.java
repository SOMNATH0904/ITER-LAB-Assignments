import java.util.Scanner;

public class QueueDemo1 {

    static Scanner sc = new Scanner(System.in);

    public static void insert(int[] Q) {
        if(rear == MAX-1) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        System.out.println("Enter element to insert : ");
        Q[rear] = sc.nextInt();
        System.out.println("Element Inserted !");
    }

    public static void delete(int[] Q) {
        if(rear == -1) {
            System.out.println("Queue is Empty!");
            return;
        }
        int data = Q[0];
        for(int i = 0; i < rear; i++) {
            Q[i] = Q[i+1];
        }
        rear--;
        System.out.println(data+" is deleted from Queue !");
    }

    public static void display(int[] Q) {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        for(int i = 0; i <= rear; i++) {
            System.out.println(Q[i]+" ");
        }
        System.out.println();
    }

    public static boolean isEmpty() {
        return rear == -1;
    }

    public static boolean isFull() {
        return rear == MAX-1;
    }

    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] queue = new int[MAX];

        while(true) {
            System.out.println("*** MENU ***");
            System.out.println("0. Exit");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("Enter your Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0 :
                    System.exit(0);

                case 1 :
                    insert(queue);
                    break;

                case 2 :
                    delete(queue);
                    break;

                case 3 :
                    display(queue);
                    break;

                case 4 :
                    System.out.println("Is the Stack is Empty : "+isEmpty());
                    break;

                case 5 :
                    System.out.println("Is the Stack is Full : "+isFull());
                    break;

                default :
                    System.out.println("Invalid Choice !");
            }
        }
    }
}