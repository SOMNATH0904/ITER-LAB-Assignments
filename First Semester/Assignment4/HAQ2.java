package Assignment4;

public class HAQ2 {
    public static void main(String[] args) {
        int num = 1000, sum = 0;
        for(int i = 1; i < num; i++) {
            if(i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        System.out.println("The Sum of the multiples of 3 or 5 below "+num+" is : "+sum);
    }
}
