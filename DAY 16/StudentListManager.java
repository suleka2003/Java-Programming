import java.util.ArrayList;
import java.util.Scanner;

public class StudentListManager {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {  
            System.out.println("\nChoose your choice below:");
            System.out.println("1. Accept student names");
            System.out.println("2. Display students");
            System.out.println("3. Search for a student");
            System.out.println("4. Remove a student");
            System.out.println("5. Display updated list");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    acceptStudentNames();
                    break;

                case 2:
                    displayStudentList();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    removeStudent();
                    break;

                case 5:
                    displayUpdatedList();
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    static void acceptStudentNames() {
        System.out.println("Enter 5 student names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students.add(scanner.nextLine());
        }
    }

    static void displayStudentList() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.println("\nStudent List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    static void searchStudent() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.print("\nEnter a name to search: ");
        String searchName = scanner.nextLine();
        int position = students.indexOf(searchName);

        if (position != -1) {
            System.out.println(searchName + " found at position " + (position + 1));
        } else {
            System.out.println("Student not found!");
        }
    }

    static void removeStudent() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.print("\nEnter a name to remove: ");
        String removeName = scanner.nextLine();
        if (students.remove(removeName)) {
            System.out.println(removeName + " removed successfully!");
        } else {
            System.out.println("Student not found in the list!");
        }
    }

    static void displayUpdatedList() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.println("\nUpdated Student List:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}