package Assignment3;

public class HAQ3 {
    public static void main(String[] args) {
        System.out.println("Enter Month number : ");
        int MonthNo = (int) (Math.random()*12)+1;
        if(MonthNo == 1)
            System.out.println("Month is January");
        else if(MonthNo == 2)
            System.out.println("Month is February");
        else if(MonthNo == 3)
            System.out.println("Month is March");
        else if(MonthNo == 4)
            System.out.println("Month is April");
        else if(MonthNo == 5)
            System.out.println("Month is May");
        else if(MonthNo == 6)
            System.out.println("Month is June");
        else if(MonthNo == 7)
            System.out.println("Month is July");
        else if(MonthNo == 8)
            System.out.println("Month is August");
        else if(MonthNo == 9)
            System.out.println("Month is September");
        else if(MonthNo == 10)
            System.out.println("Month is October");
        else if(MonthNo == 11)
            System.out.println("Month is November");
        else
            System.out.println("Month is December");
    }
}
