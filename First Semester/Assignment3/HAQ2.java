package Assignment3;

import java.util.Scanner;

public class HAQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Today's day : ");
        int day = sc.nextInt();
        System.out.println("Enter the number of days elapsed since today : ");
        int eDay = sc.nextInt();
        if(day == 0)
            System.out.print("Today is Sunday and");
        else if(day == 1)
            System.out.print("Today is Monday and");
        else if(day == 2)
            System.out.print("Today is Tuesday and");
        else if(day == 3)
            System.out.print("Today is Wednesday and");
        else if(day == 4)
            System.out.print("Today is Thursday and");
        else if(day == 5)
            System.out.print("Today is Friday and");
        else if(day == 6)
            System.out.print("Today is Saturday and");
        int fDay = day + eDay;
        if(fDay % 7 == 0)
            System.out.println(" Future day is Sunday.");
        else if(fDay % 7 == 1)
            System.out.println(" Future day is Monday.");
        else if(fDay % 7 == 2)
            System.out.println(" Future day is Tuesday.");
        else if(fDay % 7 == 3)
            System.out.println(" Future day is Wednesday.");
        else if(fDay % 7 == 4)
            System.out.println(" Future day is Thursday.");
        else if(fDay % 7 == 5)
            System.out.println(" Future day is Friday.");
        else if(fDay % 7 == 6)
            System.out.println(" Future day is Saturday.");
    }
}
