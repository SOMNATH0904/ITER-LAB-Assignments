package Assignment4;

import java.util.Scanner;

public class HAQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        String str = " ";
        for(int i = 1; i <= n; i++) {
            str = str + i + str;
            System.out.println(str);
        }
    }
}
