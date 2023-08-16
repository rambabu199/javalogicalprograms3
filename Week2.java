//16. Write a JAVAprogram to print day of week name using switch case.
import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int dayNumber = scanner.nextInt();
        scanner.close();

        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number";
        }

        System.out.println("Day of the week: " + dayName);
    }
}
