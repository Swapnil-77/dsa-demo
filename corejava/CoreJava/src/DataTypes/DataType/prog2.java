package DataTypes.DataType;
import java.util.*;
//Q.Convert int to double and double to int
public class prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.println("Enter an integer: ");
        int intValue = scanner.nextInt();
        
        // Implicit conversion from int to double
        double doubleValue = intValue;
        System.out.println("Converted to double: " + doubleValue);

        // Taking double input
        System.out.print("Enter a decimal number: ");
        double doubleInput = scanner.nextDouble();

        // Explicit conversion from double to int (truncates decimal part)
        int intConverted = (int) doubleInput;
        System.out.println("Converted to int: " + intConverted);

    }
    
}
