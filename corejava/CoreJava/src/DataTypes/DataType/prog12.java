package DataTypes.DataType;

import java.util.Scanner;

//Q.Reverse a Number
public class prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int N = sc.nextInt();
        
        int rev = 0;
        while (N > 0) {
            int lastDigit = N % 10; // Extract last digit
            rev = rev * 10 + lastDigit; // Append to reversed number
            N = N / 10; // Remove last digit
        }

        System.out.println("Reversed number: " + rev);
    }
    
}
