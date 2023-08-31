import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Four Colours : ");
        String[] colour = new String[4];

        for(int i = 0; i < colour.length; i++) {
            colour[i] = sc.nextLine();
        }
        try {
            System.out.println("Convert String to Integer");
            Integer.parseInt(colour[0]);
            throw new NumberFormatException("For Input String : "+colour[0]);
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Enter One more Colour : ");
            colour[5] = sc.nextLine();
            throw new ArrayIndexOutOfBoundsException("Index 5 out of bounds for length 4");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("The Colours Entered are : ");
        for(int i = 0; i < colour.length; i++) {
            System.out.println(colour[i]);
        }
    }
}