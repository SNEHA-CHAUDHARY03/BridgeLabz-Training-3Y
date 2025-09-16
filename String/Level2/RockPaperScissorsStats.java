import java.util.*;

public class RockPaperScissorsStats {
    static String[] choices = {"rock", "paper", "scissors"};
    public static String computerChoice() {
        int idx = (int)(Math.random() * 3);
        return choices[idx];
    }

    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return 1;
        return -1;
    }

    public static String[][] stats(int userWins, int compWins, int games) {
        String[][] arr = {
            {"Player", String.valueOf(userWins), String.format("%.2f", userWins * 100.0 / games)},
            {"Computer", String.valueOf(compWins), String.format("%.2f", compWins * 100.0 / games)}
        };
        return arr;
    }

    public static void displayResults(List<String[]> results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tResult");
        int i = 1;
        for (String[] row : results)
            System.out.println(i++ + "\t" + row[0] + "\t" + row[1] + "\t" + row[2]);
        System.out.println("\nStats:");
        System.out.println("Player\tWins\tWin%");
        for (String[] row : stats)
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        int userWins = 0, compWins = 0;
        List<String[]> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String comp = computerChoice();
            int res = winner(user, comp);
            String result = res == 0 ? "Draw" : (res == 1 ? "User" : "Computer");
            if (res == 1) userWins++;
            else if (res == -1) compWins++;
            results.add(new String[]{user, comp, result});
        }
        String[][] statArr = stats(userWins, compWins, n);
        displayResults(results, statArr);
    }
}
