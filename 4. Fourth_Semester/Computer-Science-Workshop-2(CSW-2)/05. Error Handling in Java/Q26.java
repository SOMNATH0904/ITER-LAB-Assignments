public class Q26 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("NonExistentClass");
            System.out.println("Class loaded : "+clazz.getName());
            nonExistentMethod();
        } catch(ClassNotFoundException e) {
            System.err.println("ClassNotFoundException occurred : "+e.getMessage());
        } catch(NoSuchMethodException e) {
            System.err.println("NoSuchMethodException occurred : "+e.getMessage());
        } finally {
            System.out.println("Finally block executed!");
        }
    }

    public static void nonExistentMethod() throws NoSuchMethodException {
        throw new NoSuchMethodException("Method not found!");
    }
}

/**
 * OUTPUT
 * Finally block executed!
 * ClassNotFoundException occurred : NonExistentClass
 */