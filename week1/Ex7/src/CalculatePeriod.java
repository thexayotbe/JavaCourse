import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;
    public Time(int hour, int minute, int second){
        if(hour < 0 || hour >23 || minute < 0 || minute >59 || second < 0 || second >59){
            throw new IllegalArgumentException("Invalid hour/minute/second");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int toSeconds(){
        return hour * 3600 + minute * 60 + second;
    }
    public void printTime(){
        System.out.println(hour + ":" + minute + ":" + second);
    }
    public static  Time fromSeconds(int totalSeconds){
        int hour = totalSeconds / 3600;
        int minute = (totalSeconds % 3600) / 60;
        int second = totalSeconds % 60;
        return new Time(hour, minute, second);
    }
    public static   Time calculateDifference(Time time1 , Time time2){
        int totalTim1 = time1.toSeconds();
        int totalTim2 = time2.toSeconds();
        int totalSeconds = totalTim1> totalTim2 ? totalTim1-totalTim2 : totalTim2-totalTim1;
        return Time.fromSeconds(totalSeconds);
    }
    public static  Time readTime(Scanner scanner){
        String[] timeParts = scanner.nextLine().split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);
        int second = Integer.parseInt(timeParts[2]);
        return new Time(hour, minute, second);
    }

}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first period: HH:MM:SS");
        Time time1 = Time.readTime(scanner);
        System.out.println("Enter the second period: HH:MM:SS");
        Time time2 = Time.readTime(scanner);

        Time result = Time.calculateDifference(time1,time2);
        result.printTime();
    }
}
