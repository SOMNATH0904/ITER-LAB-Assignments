public class Q27 {

    public static void main(String[] args) {
        try {
            Object obj = "Somnath";
            Integer num = (Integer) obj;
            System.out.println("Number : "+num);
        } catch (ClassCastException e) {
            System.err.println("ClassCastException occurred : "+e.getMessage());
        }
    }
}

/**
 * OUTPUT
 * ClassCastException occurred : class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
 */