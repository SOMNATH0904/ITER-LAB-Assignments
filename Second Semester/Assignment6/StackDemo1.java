import java.util.Scanner;

public class StackDemo1 {

    public static int push(int[] s, int top) {
        Scanner sc = new Scanner(System.in);
        if(top == MAX-1) {
            System.out.println("Stack is stack Overflow!");
            return top;
        }
        System.out.println("Enter an element to Push : ");
        int x = sc.nextInt();
        top = top+1;
        s[top] = x;
        System.out.println("Element Inserted!");
        return top;
    }

    public static int pop(int[] s, int top) {
        if(top == -1) {
            System.out.println("Stack Underflow!");
            return top;
        }
        int data = s[top];
        top = top-1;
        System.out.println(data+" removed from Stack!");
        return top;
    }

    public static void display(int[] s, int top) {
        if(top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        for(int i = top; i >= 0; i--) {
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == MAX-1;
    }

    public static final int MAX = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[MAX];
        int top = -1;
        while(true) {
            System.out.println("*** MENU ***");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("Enter your Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0 :
                    System.exit(0);

                case 1 :
                    top = push(stack, top);
                    break;

                case 2 :
                    top = pop(stack, top);
                    break;

                case 3 :
                    display(stack, top);
                    break;

                case 4 :
                    System.out.println("Is the Stack is Empty : "+isEmpty(top));
                    break;

                case 5 :
                    System.out.println("Is the Stack is Full : "+isFull(top));
                    break;

                default :
                    System.out.println("Invalid Choice !");
            }
        }
    }
}