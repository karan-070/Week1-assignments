import java.util.Scanner;

public class SumandDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = calculateSum(num1, num2);
        int difference = calculateDifference(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        scanner.close();
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateDifference(int a, int b) {
        return a - b;
    }
}
