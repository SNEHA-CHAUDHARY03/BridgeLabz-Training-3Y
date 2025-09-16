import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeap(int y) {
        return (y%4==0 && y%100!=0) || (y%400==0);
    }

    static int getDays(int m, int y) {
        if (m == 2 && isLeap(y)) return 29;
        return days[m-1];
    }

    static int getFirstDay(int y, int m) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        return d0;
    }

    public static void displayCalendar(int m, int y) {
        System.out.println("    " + months[m-1] + " " + y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int firstDay = getFirstDay(y, m);
        int numDays = getDays(m, y);
        for (int i = 0; i < firstDay; i++) System.out.print("   ");
        for (int d = 1; d <= numDays; d++) {
            System.out.printf("%2d ", d);
            if ((d + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        displayCalendar(m, y);
    }
}
