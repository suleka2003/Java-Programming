import java.util.*;

public class StudentMarksManager {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Integer> marks = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {  
            System.out.println("\nChoose your choice below:");
            System.out.println("1. Accept students marks");
            System.out.println("2. Display students' marks");
            System.out.println("3. Calculate and display average");
            System.out.println("4. Display highest and lowest");
            System.out.println("5. Remove marks less than 40");
            System.out.println("6. Display updated list");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    acceptStudentMarks();
                    break;
                case 2:
                    displayStudentMarks();
                    break;
                case 3:
                    displayAverage();
                    break;
                case 4:
                    displayHighestLowest();
                    break;
                case 5:
                    removeMarks();
                    break;
                case 6:
                    displayUpdatedList();
                    break;  // Missing break fixed
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    static void acceptStudentMarks() {
        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Marks " + (i + 1) + ": ");
            marks.add(scanner.nextInt());  // Changed from nextLine() to nextInt()
        }
    }

    static void displayStudentMarks() {
        if (marks.isEmpty()) {
            System.out.println("No students' marks in the list.");
            return;
        }
        System.out.println("\nMarks List:");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println((i + 1) + ". " + marks.get(i));
        }
    }

    static void displayAverage() {
        if (marks.isEmpty()) {
            System.out.println("No marks in the list.");
            return;
        }
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.size();
        System.out.println("Average marks: " + average);
    }

    static void displayHighestLowest() {
        if (marks.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
    }

    static void removeMarks() {
        if (marks.isEmpty()) {
            System.out.println("No marks in the list.");
            return;
        }
        marks.removeIf(mark -> mark < 40);
        System.out.println("Removed marks less than 40.");
    }

    static void displayUpdatedList() {
        displayStudentMarks();
    }
}