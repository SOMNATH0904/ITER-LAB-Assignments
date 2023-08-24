package Assignment2_CommandLineArgument;

public class Q3 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int random1 = (int) (Math.random()*(max-min))+min;
        int random2 = (int) (Math.random()*(max-min))+min;
        int result = random1 + random2;
        System.out.println("The first random number is : "+random1);
        System.out.println("The Second random number is : "+random2);
        System.out.println("The Sum of two random numbers between 1 and 6 is : "+result);
    }
}
