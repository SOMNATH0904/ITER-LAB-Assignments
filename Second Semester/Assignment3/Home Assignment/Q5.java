package HomeAssignment;

public class Q5 {
    public static void towerOfHanoi(int n, char fisrtRod, char lastRod, char middleRod) {
        if(n == 0)  return;
        towerOfHanoi(n-1, fisrtRod, middleRod, lastRod);
        System.out.println("Move Disk "+n+" from Rod "+fisrtRod+" to Rod "+lastRod);
        towerOfHanoi(n-1, middleRod, lastRod, fisrtRod);
    }

    public static void main(String[] args) {
        int N = 4;
        towerOfHanoi(N, 'A', 'C', 'B');
    }
}