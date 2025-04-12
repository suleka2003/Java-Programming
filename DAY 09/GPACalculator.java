import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();
        input.nextLine();

        double totalPoints = 0;
        int totalCredits = 0;
        double gradePoint;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade for subject " + i + ": ");
            String grade = input.nextLine().trim();

            switch (grade) {
                case "A+":
                case "A":
                    gradePoint = 4.0f;
                    break;
                case "A-":
                    gradePoint = 3.7f;
                    break;
                case "B+":
                    gradePoint = 3.3f;
                    break;
                case "B":
                    gradePoint = 3.0f;
                    break;
                case "B-":
                    gradePoint = 2.7f;
                    break;
                case "C+":
                    gradePoint = 2.4f;
                    break;
                case "C":
                    gradePoint = 2.0f;
                    break;
                case "C-":
                    gradePoint = 1.7f;
                    break;
                default:
                    gradePoint = 1.0f;
            }

            System.out.print("Enter the credit hours for subject " + i + ": ");
            while (!input.hasNextInt()) { 
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next();
            }
            int credits = input.nextInt();
            input.nextLine();

            totalPoints += gradePoint * credits;
            totalCredits += credits;
        }

        if (totalCredits == 0) {
            System.out.println("Error! Total credit hours cannot be zero!");
        } else {
            double gpa = totalPoints / totalCredits;
            System.out.printf("Your GPA is: %.2f%n", gpa);
        }

        input.close();
    }
}