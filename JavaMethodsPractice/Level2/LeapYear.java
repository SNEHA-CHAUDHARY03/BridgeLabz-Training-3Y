import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Year must be >= 1582");
            return;
        }
        System.out.println(year + (isLeapYear(year) ? " is a Leap Year" : " is not a Leap Year"));
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
