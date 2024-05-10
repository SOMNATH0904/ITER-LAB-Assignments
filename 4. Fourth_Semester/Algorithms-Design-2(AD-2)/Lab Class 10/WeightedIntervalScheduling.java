/**
 * Ques 1 : Write a Java Program of Weighted Interval Scheduling.
 */

/**
 * ALGORITHM
 * 
WeightedIntervalScheduling(intervals):
    Sort intervals by end time in ascending order
    Initialize an array dp of size intervals.length to store the maximum profit
    
    dp[0] = intervals[0].weight
    
    for i from 1 to intervals.length - 1:
        includeInterval = intervals[i].weight
        latestNonConflict = findLatestNonConflict(intervals, i)
        
        if latestNonConflict != -1:
            includeInterval += dp[latestNonConflict]
        
        dp[i] = max(includeInterval, dp[i-1])
    
    return dp[intervals.length - 1]

findLatestNonConflict(intervals, index):
    for i from index - 1 downto 0:
        if intervals[i].end <= intervals[index].start:
            return i
    return -1
 *
 */

/**
 * CODE
 */

import java.util.*;

class Interval implements Comparable<Interval> {
    int start;
    int end;
    int weight;

    Interval(int start, int end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Interval other) {
        return this.end - other.end;
    }
}

public class WeightedIntervalScheduling {
    public static int findMaxProfit(Interval[] intervals) {
        Arrays.sort(intervals);

        int[] dp = new int[intervals.length];
        dp[0] = intervals[0].weight;

        for (int i = 1; i < intervals.length; i++) {
            int includeInterval = intervals[i].weight;
            int latestNonConflict = latestNonConflict(intervals, i);
            if (latestNonConflict != -1) {
                includeInterval += dp[latestNonConflict];
            }
            dp[i] = Math.max(includeInterval, dp[i - 1]);
        }
        return dp[intervals.length - 1];
    }

    private static int latestNonConflict(Interval[] intervals, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (intervals[i].end <= intervals[index].start) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Interval[] intervals = {
                new Interval(1, 4, 5),
                new Interval(3, 5, 7),
                new Interval(0, 6, 6),
                new Interval(4, 7, 8),
                new Interval(3, 8, 9),
                new Interval(5, 9, 10)
        };

        System.out.println("Maximum Profit : "+findMaxProfit(intervals));
    }
}

/**
 * OUTPUT
 * 
 * Maximum Profit : 17
 */