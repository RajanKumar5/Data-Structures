package Binary_Search;

import java.util.Scanner;

public class AttendanceTime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER IN TIME (EX. 9:15): ");
        String inTime = sc.nextLine();

        System.out.print("ENTER OUT TIME (EX. 16:15): ");
        String outTime = sc.nextLine();

        showWFHDetails(inTime, outTime);

        sc.close();
    }

    static void showWFHDetails(String inTime, String outTime) {
        // standard time should be 9 hrs and 30 mins
        final int STANDARD_TIME_IN_MINUTES = (9 * 60) + 30;

        String inTimeArr[] = inTime.split(":");
        String outTimeArr[] = outTime.split(":");

        final int IN_TIME_IN_MINUTE = (Integer.parseInt(inTimeArr[0]) * 60) + Integer.parseInt(inTimeArr[1]);
        final int OUT_TIME_IN_MINUTE = (Integer.parseInt(outTimeArr[0]) * 60) + Integer.parseInt(outTimeArr[1]);

        final int TIME_SPENT_IN_MINUTES = OUT_TIME_IN_MINUTE - IN_TIME_IN_MINUTE;
        double totalTimeSpent = (double) TIME_SPENT_IN_MINUTES / 60;
        totalTimeSpent = Math.round(totalTimeSpent * 100.0) / 100.0;
        int totalTimeSpentHr = TIME_SPENT_IN_MINUTES / 60;
        int totalTimeSpentMin = TIME_SPENT_IN_MINUTES % 60;
        System.out.println("TOTAL TIME SPENT: " + totalTimeSpent + " i.e. " + totalTimeSpentHr + " hrs "
                + totalTimeSpentMin + " min");

        final int REMAINING_TIME_IN_MINUTES = STANDARD_TIME_IN_MINUTES - TIME_SPENT_IN_MINUTES;
        double remainingTime = (double) REMAINING_TIME_IN_MINUTES / 60;
        remainingTime = Math.round(remainingTime * 100.0) / 100.0;
        int remainingTimeHr = REMAINING_TIME_IN_MINUTES / 60;
        int remainingTimeMin = REMAINING_TIME_IN_MINUTES % 60;
        System.out.println(
                "REMAINING TIME: " + remainingTime + " i.e. " + remainingTimeHr + " hrs " + remainingTimeMin + " min");

        if (REMAINING_TIME_IN_MINUTES > 0) {
            int END_TIME = OUT_TIME_IN_MINUTE + 1 + REMAINING_TIME_IN_MINUTES;
            int WFHStartHr = (OUT_TIME_IN_MINUTE + 1) / 60;
            int WFHStartMin = (OUT_TIME_IN_MINUTE + 1) % 60;
            String WFHStartTime = String.format("%02d", WFHStartHr) + ":" + String.format("%02d", WFHStartMin);
            int WFHEndHr = END_TIME / 60;
            int WFHEndMin = END_TIME % 60;
            String WFHEndTime = String.format("%02d", WFHEndHr) + ":" + String.format("%02d", WFHEndMin);
            System.out.println("WFH TIME: " + WFHStartTime + " to " + WFHEndTime);
        } else {
            System.out.println("NO NEED TO APPLY WFH");
        }
    }
}
