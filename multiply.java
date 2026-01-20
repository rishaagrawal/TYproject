import java.util.Scanner; // Import the Scanner class

public class multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter first number: ");
        // Read the first integer from the user
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        // Read the second integer from the user
        int num2 = scanner.nextInt();

        // Calculate the product
        int product = num1 * num2;

        // Display the result
        System.out.println(num1 + " * " + num2 + " = " + product);

        scanner.close(); // Close the scanner
    }
}
/* 
Example Output:
Enter first number: 5
Enter second number: 7
5 * 7 = 35
*/
