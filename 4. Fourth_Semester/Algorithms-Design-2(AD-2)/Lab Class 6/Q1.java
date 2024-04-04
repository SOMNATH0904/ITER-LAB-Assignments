/**
 * Ques 1 : Write a Java Program to implement Interval Scheduling using Switch Case.
 */

/**
 * ALGORITHM
 * 
 * IntervalScheduling(intervals):
    Sort intervals based on end times in ascending order
    schedule = []
    Add first interval to schedule
    
    lastScheduledIndex = 0
    for i = 1 to intervals.length - 1:
        if intervals[i].start >= intervals[lastScheduledIndex].end:
            Add intervals[i] to schedule
            lastScheduledIndex = i
            
    return schedule
 */

/**
 * CODE
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Q1 {
    public static void scheduleIntervals(ArrayList<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(a -> a.end));
        ArrayList<Interval> schedule = new ArrayList<>();
        schedule.add(intervals.get(0));
        int lastScheduledIndex = 0;

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start >= intervals.get(lastScheduledIndex).end) {
                schedule.add(intervals.get(i));
                lastScheduledIndex = i;
            }
        }

        System.out.println("\nScheduled Intervals:");
        for (Interval interval : schedule) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Interval> intervals = new ArrayList<>();
        int ch;

        do {
            System.out.println("<-- Interval Scheduling -->");
            System.out.println("1. Add Interval");
            System.out.println("2. Schedule Intervals");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = scanner.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter start time of interval: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter end time of interval: ");
                    int end = scanner.nextInt();
                    intervals.add(new Interval(start, end));
                    break;
                case 2:
                    scheduleIntervals(intervals);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (ch != 3);
    }
}


/**
 * OUTPUT
 * 
 * <-- Interval Scheduling -->
 * 1. Add Interval
 * 2. Schedule Intervals
 * 3. Exit
 * Enter your choice: 1
 * Enter start time of interval: 5
 * Enter end time of interval: 8
 * 
 * <-- Interval Scheduling -->
 * 1. Add Interval
 * 2. Schedule Intervals
 * 3. Exit
 * Enter your choice: 1
 * Enter start time of interval: 3
 * Enter end time of interval: 9
 * 
 * <-- Interval Scheduling -->
 * 1. Add Interval
 * 2. Schedule Intervals
 * 3. Exit
 * Enter your choice: 2
 * 
 * Scheduled Intervals:
 * [5, 8]
 * 
 * <-- Interval Scheduling -->
 * 1. Add Interval
 * 2. Schedule Intervals
 * 3. Exit
 * Enter your choice: 3
 * Exiting...
 */