class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time inc() {
        second++;
        if (second >= 60) {
            minute++;
            second = 0;
        }
        if (minute >= 60) {
            hour++;
            minute = 0;
        }
        return this;
    }


    public static Time differentTimes(Time time1, Time time2) {
        int totalSecondsTime1 = time1.hour * 3600 + time1.minute * 60 + time1.second;
        int totalSecondsTime2 = time2.hour * 3600 + time2.minute * 60 + time2.second;

        int diffInSeconds = Math.abs(totalSecondsTime1 - totalSecondsTime2);

        int hours = diffInSeconds / 3600;
        int minutes = (diffInSeconds % 3600) / 60;
        int seconds = diffInSeconds % 60;

        return new Time(hours, minutes, seconds);
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
}

class TimeCreator {
}


public class Main {
    public static void main(String[] args) {
        // Creating two Time instances
        Time time1 = new Time(2, 30, 45); // 2 hours, 30 minutes, and 45 seconds
        Time time2 = new Time(1, 15, 20); // 1 hour, 15 minutes, and 20 seconds

        // Displaying initial times
        System.out.print("Time 1: ");
        time1.displayTime();
        System.out.print("Time 2: ");
        time2.displayTime();

        // Calculating and displaying the difference
        Time diff = Time.differentTimes(time1, time2);
        System.out.print("Difference: ");
        diff.displayTime();

        // Advancing time1 by three seconds using chaining
        time1.inc().inc().inc(); // Incrementing by 3 seconds
        System.out.print("Time 1 after advancing by 3 seconds: ");
        time1.displayTime();
    }
}