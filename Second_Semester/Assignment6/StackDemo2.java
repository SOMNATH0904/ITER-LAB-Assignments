import java.util.Scanner;

class Node {
    int info;
    Node next;
}

public class StackDemo2 {

    public static Node push(Node top) {
        Scanner sc = new Scanner(System.in);
        Node temp = new Node();
        System.out.println("Enter an element to Push : ");
        temp.info = sc.nextInt();
        temp.next = top;
        top = temp;
        System.out.println("Element Inserted !");
        return top;
    }

    public static Node pop(Node top) {
        if(top == null) {
            System.out.println("Stack Underflow !");
            return top;
        }
        int num = top.info;
        top = top.next;
        System.out.println(num+" data is Deleted !");

        return top;
    }

    public static void display(Node top) {
        Node temp = top;
        if(top == null) {
            System.out.println("Stack Underflow !");
            return;
        }
        while(temp != null) {
            System.out.print(temp.info+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static boolean isEmpty(Node top) {
        return top == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;
        while(true) {
            System.out.println("*** MENU ***");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. isEmpty");
            System.out.println("Enter your Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0 :
                    System.exit(0);

                case 1 :
                    top = push(top);
                    break;

                case 2 :
                    top = pop(top);
                    break;

                case 3 :
                    display(top);
                    break;

                case 4 :
                    System.out.println("Is the Stack is Empty : "+isEmpty(top));
                    break;

                default :
                    System.out.println("Invalid Choice !");
            }
        }
    }
}