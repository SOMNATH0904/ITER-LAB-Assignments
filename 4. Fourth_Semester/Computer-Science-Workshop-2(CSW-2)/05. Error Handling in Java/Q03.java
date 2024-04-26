class CustomNullPointerException extends NullPointerException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class Q03 {
    public static void main(String[] args) {
        try {
            String str = null;
            if (str == null) {
                throw new CustomNullPointerException("Custom Null Pointer Exception: nullString is null");
            }
        } catch (CustomNullPointerException e) {
            System.out.println("Caught Custom Null Pointer Exception: " + e.getMessage());
        }
    }
}


/**
 * OUTPUT
 * Caught Custom Null Pointer Exception: Custom Null Pointer Exception: nullString is null
 */
