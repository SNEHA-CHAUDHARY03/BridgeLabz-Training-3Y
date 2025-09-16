// Computes Sam's average percentage in PCM
class AveragePCMMarks {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double averagePercent = (maths + physics + chemistry) / 3.0;

        System.out.printf("Sam’s average mark in PCM is %.2f%n", averagePercent);
    }
}