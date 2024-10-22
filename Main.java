package lab9;

public class Main {
    public static void main(String[] args) {
        // Example usage

        // Creating a regular student
        Student regularStudent = new Student(366, "CS101", "Introduction to Computer Science");
        System.out.println(regularStudent.getDetails());

        // Creating a promoted student
        PromotedStudent promotedStudent = new PromotedStudent(375, "MATH201", "Calculus");
        System.out.println(promotedStudent.getDetails());

        // Modifying promoted student status
        promotedStudent.setPromotionStatus(false);
        System.out.println(promotedStudent.getDetails());

        // Creating a failed student (immutable)
        FailedStudent failedStudent = new FailedStudent(399, "PHY301", "Physics");
        System.out.println(failedStudent.getDetails());
    }
}
