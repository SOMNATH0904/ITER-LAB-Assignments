public class Q05 {
    public static void main(String[] args) {
        try {
            double result = computeComplexMath(45);
            System.out.println("Result : "+result);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException occurred : "+e.getMessage());
        } catch (Exception e) {
            System.err.println("Error occurred : "+e.getMessage());
        }
    }

    public static double computeComplexMath(double angleDegrees) {
        try {
            double radians = Math.toRadians(angleDegrees);
            double sineValue = Math.sin(radians);
            double cosineValue = Math.cos(radians);
            double tangentValue = Math.tan(radians);
            double result = sineValue + cosineValue + tangentValue;
            return result;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException : One or more trigonometric functions returned null!");
        }
    }
}

/**
 * OUTPUT
 * Result : 2.414213562373095
 */