public class Q07 {
    private String name;
    private int age;
    private String course;

    public Q07(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    protected void finalize() {
        System.out.println("Q07 " + name + " has been successfully garbage collected.");
    }

    public static void main(String[] args) {
        Q07 Q071 = new Q07("John", 20, "Computer Science");
        Q07 Q072 = new Q07("Alice", 22, "Engineering");
        Q07 Q073 = new Q07("Emily", 21, "Mathematics");

        Runtime runtime = Runtime.getRuntime();
        long totalMemoryBefore = runtime.totalMemory();
        long freeMemoryBefore = runtime.freeMemory();
        System.out.println("Total Memory before: " + totalMemoryBefore);
        System.out.println("Free Memory before: " + freeMemoryBefore);

        Q071 = null;
        Q072 = null;
        Q073 = null;

        System.gc();

        long totalMemoryAfter = runtime.totalMemory();
        long freeMemoryAfter = runtime.freeMemory();
        System.out.println("Total Memory after: " + totalMemoryAfter);
        System.out.println("Free Memory after: " + freeMemoryAfter);
    }
}

/**
 * OUTPUT
 *
 * Total Memory before: 130023424
 * Free Memory before: 126959488
 * Total Memory after: 8388608
 * Free Memory after: 7576320
 */