
package DataTypes.DataType;
 import java.util.*;
public class prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int intNumber = scanner.nextInt();

        // Take double input
        System.out.print("Enter a decimal number: ");
        double doubleNumber = scanner.nextDouble();

        // Perform addition
        double sum = intNumber + doubleNumber;

        // Print the result
        System.out.println("Sum: " + sum);

        // Close the scanner
        scanner.close();
}
    
}
