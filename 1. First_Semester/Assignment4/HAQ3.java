package Assignment4;

public class HAQ3 {
    public static void main(String[] args) {
        System.out.println("Integers from 1000 to 2000 with Five Integers per line is : ");
        for(int i = 1000; i <= 2000; i++) {
            System.out.print(i+" ");
            if((i+1)%5 == 0) {
                System.out.println();
            }
        }
    }
}
