public class Q04 {

    private String name;

    public Q04(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        new Q04("Q04");

        System.gc();
    }
}

/**
 * OUTPUT
 *
 * Garbage collected: Q04
 */