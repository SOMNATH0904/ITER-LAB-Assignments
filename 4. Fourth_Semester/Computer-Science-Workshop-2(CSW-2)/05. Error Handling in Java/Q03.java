public class Q03 extends RuntimeException {

    public Q03(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        String input = null;
        try {
            if(input == null) {
                throw new Q3("Input string is null!");
            }
        } catch (Q03 e) {
            System.err.println("CustomNullPointerException occurred : "+e.getMessage());
        }
    }
}

/**
 * OUTPUT
 * CustomNullPointerException occurred : Input string is null!
 */