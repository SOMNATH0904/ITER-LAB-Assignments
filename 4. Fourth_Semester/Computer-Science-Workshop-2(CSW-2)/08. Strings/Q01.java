public class Q01 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("Using string literals:");
        System.out.println("str1 memory address: " + System.identityHashCode(str1));
        System.out.println("str2 memory address: " + System.identityHashCode(str2));

        System.out.println("\nUsing new keyword:");
        System.out.println("str3 memory address: " + System.identityHashCode(str3));
        System.out.println("str4 memory address: " + System.identityHashCode(str4));

        System.out.println("\nString comparison:");
        System.out.println("Comparing str1 and str2: " + (str1 == str2));
        System.out.println("Comparing str1 and str3: " + (str1 == str3));
        System.out.println("Comparing str3 and str4: " + (str3 == str4));
        System.out.println("Using .equals() method:");
        System.out.println("Comparing str1 and str3: " + str1.equals(str3));
        System.out.println("Comparing str3 and str4: " + str3.equals(str4));
    }
}

/**
 * OUTPUT
 *
 * Using string literals:
 * str1 memory address: 363771819
 * str2 memory address: 363771819
 *
 * Using new keyword:
 * str3 memory address: 495053715
 * str4 memory address: 1922154895
 *
 * String comparison:
 * Comparing str1 and str2: true
 * Comparing str1 and str3: false
 * Comparing str3 and str4: false
 * Using .equals() method:
 * Comparing str1 and str3: true
 * Comparing str3 and str4: true
 */