public class Q28 {
    public static void main(String[] args) {
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.err.println("StackOverflowError occurred : "+e.getMessage());
        }
    }

    public static void recursiveMethod(int counter) {
        System.out.println("Counter : "+counter);
        recursiveMethod(counter + 1);
    }
}

/**
 * OUTPUT
 *
 * Counter : 1
 * Counter : 2
 * Counter : 3
 * Counter : 4
 * Counter : 5
 * Counter : 6
 * Counter : 7
 * Counter : 8
 * Counter : 9
 * .
 * .
 * .
 * .
 * .
 * .
 * .
 * .
 * Counter : 6041
 * Counter : 6042
 * Counter : 6043
 * Counter : 6044
 * Counter : 6045
 * Counter : 6046
 * StackOverflowError occurred : null
 */