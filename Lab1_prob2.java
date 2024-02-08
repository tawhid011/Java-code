import java.util.Scanner;

public class Lab1_prob2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of minutes: ");
            long minutes = scanner.nextLong();

            long minutesInDay = 24 * 60;
            long minutesInYear = minutesInDay * 365;

            long years = minutes / minutesInYear;
            long remainingMinutes = minutes % minutesInYear;
            long days = remainingMinutes / minutesInDay;

            System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

            scanner.close();
        }
    }
