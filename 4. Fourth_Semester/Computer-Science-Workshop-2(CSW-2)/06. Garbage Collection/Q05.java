public class Q05 {
    private int intValue;
    private double doubleValue;

    public void initialize(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void update(int intValueDelta, double doubleValueDelta) {
        this.intValue += intValueDelta;
        this.doubleValue += doubleValueDelta;
    }

    public static void main(String[] args) {
        Q05 obj1 = new Q05();
        obj1.initialize(10, 5.5);

        Q05 obj2 = new Q05();
        obj2.initialize(20, 8.8);

        Runtime runtime = Runtime.getRuntime();
        long totalMemoryBefore = runtime.totalMemory();
        long freeMemoryBefore = runtime.freeMemory();
        System.out.println("Total Memory before: " + totalMemoryBefore);
        System.out.println("Free Memory before: " + freeMemoryBefore);

        obj1 = null;
        obj2 = null;

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
 * Free Memory before: 126959456
 * Total Memory after: 8388608
 * Free Memory after: 7576640
 */