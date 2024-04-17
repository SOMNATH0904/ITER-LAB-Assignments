public class Q03 {

    private String name;

    public Q03(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        Q03 obj = new Q03("Object");

        obj = null;

        System.gc();
    }
}

/**
 * OUTPUT
 *
 * Garbage collected: Object
 */