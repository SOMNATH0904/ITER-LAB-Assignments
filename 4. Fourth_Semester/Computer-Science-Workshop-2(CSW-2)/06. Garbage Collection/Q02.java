public class Q02 {

    private String name;

    public Q02(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        Q02 obj1 = new Q02("Object1");
        Q02 obj2 = new Q02("Object2");

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}

/**
 * OUTPUT
 *
 * Garbage collected: Object2
 */