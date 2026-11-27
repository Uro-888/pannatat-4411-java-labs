package udomsilp.pannatat.lab2;

public class DurationCalculator {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.err.println
            ("Error: Invalid number of arguments. Please provide exactly six arguments");
            return;
        }

        Integer StartHour = Integer.parseInt(args[0]);
        Integer StartMinute = Integer.parseInt(args[1]);
        Integer StartSecond = Integer.parseInt(args[2]);
        Integer EndHour = Integer.parseInt(args[3]);
        Integer EndMinute = Integer.parseInt(args[4]);
        Integer EndSecond = Integer.parseInt(args[5]);
        final int SECONDS_PER_HOUR = 3600;
        if (StartHour < 0 || StartHour > 24 || EndHour < 0 || EndHour > 24) {
            System.err.println("Error: Your time is invalid");
            return;
        }
        if (StartMinute < 0 || StartMinute > 60 || EndMinute < 0 || EndMinute > 60
            || StartSecond < 0 || StartSecond > 60 || EndSecond < 0 || EndSecond > 60) {
            System.err.println("Error: Your time is invalid");
            return;
        }
        int StartSecondsTotal = (StartHour * SECONDS_PER_HOUR)+(StartMinute * 60)+StartSecond;
        int EndSecondsTotal = (EndHour * SECONDS_PER_HOUR)+(EndMinute * 60)+EndSecond;
        int TimeDurationSeconds = (EndSecondsTotal-StartSecondsTotal);
        double TimeDurationMinutes = (double)TimeDurationSeconds / 60;
        int hours = (TimeDurationSeconds / SECONDS_PER_HOUR);
        int RemainSeconds = (TimeDurationSeconds % SECONDS_PER_HOUR);
        int minutes = (RemainSeconds / 60);
        int seconds = (RemainSeconds % 60);
        if (TimeDurationSeconds < 0) {
            System.err.println("Your end time must be more than your start time");
            return;
        }
        System.out.println("Duration is "+TimeDurationMinutes+"Minutes");
        System.out.println("That is "+hours+" hours"+minutes+" minutes"+seconds+" seconds");

    }
    
}
