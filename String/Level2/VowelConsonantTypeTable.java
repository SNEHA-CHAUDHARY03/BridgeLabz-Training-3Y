import java.util.Scanner;

public class VowelConsonantTypeTable {
    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] charTypeTable(String str) {
        int len = 0;
        try { while (true) { str.charAt(len); len++; } } catch (Exception e) {}
        String[][] arr = new String[len][2];
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            arr[i][0] = String.valueOf(c);
            arr[i][1] = charType(c);
        }
        return arr;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        String[][] table = charTypeTable(input);
        displayTable(table);
    }
}
