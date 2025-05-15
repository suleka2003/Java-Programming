import java.util.Scanner;

class NumInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            try {
                int value = input.nextInt();
                sum += value; // or sum += Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! please enter a number!");
                input.next();
                i--;
            }
        }

        System.out.println("Sum is " + sum);
        input.close();
    }
}