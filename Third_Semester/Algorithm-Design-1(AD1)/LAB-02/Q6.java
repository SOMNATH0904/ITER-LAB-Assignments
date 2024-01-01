import java.util.Scanner;

public class Q6 {

    public static String deciToHexa(String s) {
        String result = "";
        int n = Integer.parseInt(s);
        int remainder = n % 16;
        if(n == 0) return "";
        else {
            switch(remainder) {
                case 10:
                    result = "A";
                    break;
                case 11:
                    result = "B";
                    break;
                case 12:
                    result = "C";
                    break;
                case 13:
                    result = "D";
                    break;
                case 14:
                    result = "E";
                    break;
                case 15:
                    result = "F";
                    break;
                default:
                    result = remainder + result;
                    break;
            }
        }
        return deciToHexa(Integer.toString(n/16)+result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Conversion from Decimal no to Hexadecimal no is : "+deciToHexa(str));
    }
}
