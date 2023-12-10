import java.util.Scanner;

public class LinkedList {

    static Node start = null;

    public static class Node {
        protected int regd_no;
        protected float mark;
        protected Node next;
    }

    public static Node create(Node start) {
        Scanner sc = new Scanner(System.in);
        Node last = null;
        char ch;
        do {
            Node n = new Node();
            System.out.println("Enter Registration No : ");
            int regd = sc.nextInt();
            System.out.println("Enter Marks : ");
            float mark = sc.nextFloat();
            n.regd_no = regd;
            n.mark = mark;
            n.next = null;
            if(start == null) {
                start = n;
                last = n;
            }
            else {
                last.next = n;
                last = n;
            }
            System.out.println("Want to create another Node (Y/N) : ");
            ch = sc.next().charAt(0);
        } while(ch == 'Y' || ch == 'y');
        return start;
    }

    public static Node InsBeg(Node start) {
        Scanner sc = new Scanner(System.in);
        Node n = new Node();
        System.out.println("Enter Registration No and Marks : ");
        n.regd_no = sc.nextInt();
        n.mark = sc.nextFloat();
        n.next = start;
        start = n;
        return start;
    }

    public static Node InsEnd(Node start) {
        Scanner sc = new Scanner(System.in);
        Node n = new Node();
        System.out.println("Enter Registration No and Marks : ");
        n.regd_no = sc.nextInt();
        n.mark = sc.nextFloat();
        n.next = null;
        Node temp = start;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
        return start;
    }

    public static Node InsAny(Node start) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int count = 0;
        Node p = start;
        System.out.println("Enter the Location you want to Insert : ");
        int loc = sc.nextInt();
        while(p != null) {
            count++;
            p = p.next;
        }
        if(loc <= count + 1) {
            if(loc == 1)
                start = InsBeg(start);
            else if(loc == count + 1)
                start = InsEnd(start);
            else {
                p = start;
                while(i < loc - 1) {
                    p = p.next;
                    i++;
                }
                Node curr = new Node();
                System.out.println("Enter Registration No and Marks : ");
                curr.regd_no = sc.nextInt();
                curr.mark = sc.nextFloat();
                curr.next = p.next;
                p.next = curr;
            }
        } else
            System.out.println("Invalid Location !");
        return start;

    }

    public static Node DelBeg(Node start) {
        Node temp = start;
        if(start == null) {
            System.out.println("List is Empty !");
        }
        else {
            System.out.println("Node To be Deleted : "+temp.regd_no+" \t "+temp.mark);
            start =  start.next;
        }
        return start;
    }

    public static Node DelEnd(Node start) {
        Node temp1 = start;
        Node temp2 = null;
        while(temp1.next != null) {
            temp2 = temp1;
            temp1 = temp1.next;
        }
        System.out.println("Node to be Deleted : "+temp1.regd_no+" \t "+temp1.mark);
        temp2.next = null;
        return start;
    }

    public static Node DelAny(Node start) {
        Scanner sc = new Scanner(System.in);
        Node temp = start;
        Node n = new Node();
        System.out.println("Enter location");
        int loc = sc.nextInt();
        for (int i = 1; i < loc && temp.next != null; i++) {
            n = temp;
            temp = temp.next;
        }
        n.next = temp.next;
        return start;
    }

    public static void search(Node start) {
        if(start == null) {
            System.out.println("List is Empty !");
        }
        else {
            Node temp = start;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Registration number you want to search to update mark of student : ");
            int x = sc.nextInt();
            while(temp != null) {
                if(temp.regd_no == x) {
                    System.out.println("Enter Mark to Update : ");
                    temp.mark = sc.nextFloat();
                }
                temp = temp.next;
            }
        }
    }

    public static void sort(Node start) {
        if(start == null || start.next == null) {
            return;
        }
        Node currNode = start;
        while(currNode != null) {
            Node nextNode = currNode.next;
            while (nextNode != null) {
                if (currNode.mark < nextNode.mark) {
                    float mark = currNode.mark;
                    currNode.mark = nextNode.mark;
                    nextNode.mark = mark;
                }
                nextNode = nextNode.next;
            }
            currNode = currNode.next;
        }
    }

    public static int count(Node start) {
        Node temp = start;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node reverse(Node start) {
        if(start == null || start.next == null) {
            return start;
        }
        Node prevNode = null;
        Node currNode = start;
        Node nextNode = null;
        while(currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        start = prevNode;
        return start;
    }

    public static void display(Node start) {
        Node temp = start;
        System.out.println("Regd No \t Marks");
        while(temp != null) {
            System.out.println(temp.regd_no+" \t "+temp.mark);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;
        while(true) {
            System.out.println("***** MENU *****");
            System.out.println("1. Creation");
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Insert at End");
            System.out.println("4. Insert Anywhere / At any Position of the List");
            System.out.println("5. Delete at Beginning");
            System.out.println("6. Delete at End");
            System.out.println("7. Delete Anywhere / At any Position of the List");
            System.out.println("8. Search");
            System.out.println("9. Sort");
            System.out.println("10. Count");
            System.out.println("11. Reverse");
            System.out.println("12. Display");
            System.out.println("Enter the Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0 : System.exit(0);
                case 1 :
                    start = create(start);
                    System.out.println();
                    break;
                case 2 :
                    start = InsBeg(start);
                    System.out.println();
                    break;
                case 3 :
                    start = InsEnd(start);
                    System.out.println();
                    break;
                case 4 :
                    start = InsAny(start);
                    System.out.println();
                    break;
                case 5 :
                    start = DelBeg(start);
                    System.out.println();
                    break;
                case 6 :
                    start = DelEnd(start);
                    System.out.println();
                    break;
                case 7 :
                    start = DelAny(start);
                    System.out.println();
                    break;
                case 8 :
                    search(start);
                    System.out.println();
                    break;
                case 9 :
                    System.out.println("Sorting according to the marks secured by the student from higher to lower");
                    sort(start);
                    System.out.println();
                    break;
                case 10 :
                    System.out.println("No of Nodes Present in List are : "+count(start));
                    System.out.println();
                    break;
                case 11 :
                    System.out.println("Reverse of the List is -> ");
                    start = reverse(start);
                    System.out.println();
                    break;
                case 12 :
                    System.out.println("Elements Present in the List are -> ");
                    display(start);
                    System.out.println();
                    break;
                default:
                    System.out.println("Entered Choice is Wrong !");
            }
        }
    }
}