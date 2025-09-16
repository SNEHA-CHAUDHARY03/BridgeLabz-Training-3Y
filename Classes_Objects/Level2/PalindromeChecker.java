class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = clean.length();
        for (int i = 0; i < n / 2; i++) {
            if (clean.charAt(i) != clean.charAt(n - 1 - i)) return false;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println("\"" + text + "\" is a palindrome.");
        else
            System.out.println("\"" + text + "\" is not a palindrome.");
    }
}

// Example usage
class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker("Madam");
        pc.displayResult();
    }
}
