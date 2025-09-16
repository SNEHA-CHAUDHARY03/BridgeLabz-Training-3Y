import java.util.*;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
    }
    static void printCalendar(int month, int year) {
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (isLeapYear(year)) days[1] = 29;
        int firstDay = getFirstDay(month, year);
        System.out.println("   " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int d = 1; d <= days[month-1]; d++) {
            System.out.printf("%3d ", d);
            if ((d + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
    static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
    static int getFirstDay(int m, int y) {
        int d = 1;
        if (m < 3) { m += 12; y--; }
        int k = y % 100, j = y / 100;
        int h = (d + 13*(m+1)/5 + k + k/4 + j/4 + 5*j) % 7;
        return (h + 6) % 7; // 0=Sun
    }
}
