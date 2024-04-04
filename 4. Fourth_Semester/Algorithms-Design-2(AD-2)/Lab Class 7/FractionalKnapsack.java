/**
 * Ques 1 : Write a Java Program to implement Fractional Knapsack Algorithm.
 */

/**
 * ALGORITHM
 * 
 * function FractionalKnapsack ( w [],c[],wk) 
 *      for i = 1 to n do 
 *          x[i] = 0
 *      Weight = 0
 *      H = BuildMaxHeap (C/W)      //Use Max heap 
 *      while Weight < Wk do 
 *          i = H H.GetMax() 
 *          if(weight+ W[i] <= Wk ) do 
 *              X[i] = 1
 *              weight = weight+ w[i]
 *          else
 *              x[i] =(Wk-weight)/w[i]
 *              Weight = Wk
 *       return X
 */

/**
 * CODE
 */

import java.util.Arrays;

public class FractionalKnapsack {
    private class Items implements Comparable<Items> {
        int wt;
        int cost;
        double density;

        Items(int w, int v) {
            wt =w;
            cost =v;
            density = (double) cost / wt;
        }

        public int compareTo(Items s2) { // decreasing order
            return (int) (s2.density - this.density);
        }
    }

    public double getMaxCostFractional(int[] wt, int[] cost, int capacity) {
        double totalCost = 0;
        int n = wt.length;
        Items[] itemList = new Items[n];
        for(int i = 0; i < n; i++)
            itemList[i] = new Items(wt[i], cost[i]);
        Arrays.sort(itemList);
        for(int i = 0; i < n; i++) {
            if (capacity - itemList[i].wt >= 0) {
                capacity -= itemList[i].wt;
                totalCost += itemList[i].cost;
            } else {
                totalCost += (itemList[i].density * capacity);
                break;
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] wt = { 10, 40, 20, 30 };
        int[] cost = { 60, 40, 90, 120 };
        int capacity = 50;
        FractionalKnapsack kp = new FractionalKnapsack();
        double maxCost = kp.getMaxCostFractional(wt, cost, capacity);
        System.out.println("Maximum cost obtained : "+maxCost);
    }
}


/**
 * OUTPUT
 * 
 * Maximum cost obtained : 230.0
 */