class CustomCheckedException extends Exception {
    public CustomCheckedException(String msg) {
        super(msg);
    }
}

public class Q22 {
    public static void someMethod(int val) throws CustomCheckedException {
        if(val < 0) {
            throw new CustomCheckedException("Value cannot be negative.");
        }
        System.out.println("Value is: " + val);
    }

    public static void main(String[] args) {
        try {
            someMethod(-5);
        } catch(CustomCheckedException e) {
            System.err.println("CustomCheckedException occurred : "+e.getMessage());
        }
    }
}

/**
 * OUTPUT
 * CustomCheckedException occurred : Value cannot be negative.
 */