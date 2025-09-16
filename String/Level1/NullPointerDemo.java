public class NullPointerDemo {
    static void generateException() {
        String text = null;
        System.out.println(text.length()); // Will throw NullPointerException
    }

    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment to see the exception
        // generateException();
        handleException();
    }
}
