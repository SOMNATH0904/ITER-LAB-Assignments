public class Q01 {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();
            System.out.println("Length of the String : "+length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred : "+e.getMessage());
        }
    }
}

/**
 * OUTPUT
 * NullPointerException occurred : Cannot invoke "String.length()" because "str" is null
 */