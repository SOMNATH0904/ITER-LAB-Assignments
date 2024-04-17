public class Q01 {

    private String name;

    public Q01(String name) {
        this.name = name;
    }

    public void show() {
        Q01 obj = new Q01("InnerObject");
        obj.display();
    }

    public void display() {
        new Q01("InnerObject").finalize();
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        Q01 obj = new Q01("MainObject");
        obj.show();

        System.gc();
    }
}

/**
 * OUTPUT
 *
 * Garbage collected: InnerObject
 * Garbage collected: InnerObject
 * Garbage collected: InnerObject
 */