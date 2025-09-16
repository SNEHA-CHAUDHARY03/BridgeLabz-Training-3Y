import java.util.Scanner;

class YoungTallFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Amar's height: ");
        int heightAmar = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int heightAkbar = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = input.nextInt();

        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Youngest is Amar");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Youngest is Akbar");
        } else {
            System.out.println("Youngest is Anthony");
        }

        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Tallest is Amar");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Tallest is Akbar");
        } else {
            System.out.println("Tallest is Anthony");
        }

        input.close();
    }
}