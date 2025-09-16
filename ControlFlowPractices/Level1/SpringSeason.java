import java.util.Scanner;

// Class to check if the date is in Spring Season
class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input month and day
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day: ");
        int day = input.nextInt();

        // Check for Spring Season
        boolean isSpring = ( (month == 3 && day >= 20) ||
                             (month == 4) ||
                             (month == 5) ||
                             (month == 6 && day <= 20) );

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        input.close();
    }
}
