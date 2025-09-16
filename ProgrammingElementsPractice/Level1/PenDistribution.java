// Class name indicates purpose: PenDistribution
class PenDistribution {

    public static void main(String[] args) {

        // Total pens and number of students
        int totalPens = 14;
        int students = 3;

        // Pens per student using division operator
        int pensPerStudent = totalPens / students;

        // Remaining pens using modulus operator
        int remainingPens = totalPens % students;

        // Display result
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}