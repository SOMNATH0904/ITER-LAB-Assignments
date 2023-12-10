package HomeAssignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        System.out.println("Enter the lines : ");
        for(int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }
        System.out.println("The Reverse Order of each lines are : ");
        for(int i = n - 1; i >= 0; i--){
            System.out.println(str[i]);
        }
    }
}