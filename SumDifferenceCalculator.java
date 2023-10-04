import java.util.Scanner;

public class SumDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                 //Taking the user input

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();                             //Getting the First Integer

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();                             //Getting the Second Integer

        int sum = calculateSum(num1, num2);                       //Storing the sum
        int difference = calculateDifference(num1, num2);         //Storing the difference

        System.out.println("Sum: " + sum);                        //Printing the sum
        System.out.println("Difference: " + difference);          //Printing the difference

        scanner.close();
    }

    public static int calculateSum(int a, int b) {                //Method to Calculate Sum
        return a + b;
    }

    public static int calculateDifference(int a, int b) {         //Method to Calculate Difference
        return a - b;
    }
}
