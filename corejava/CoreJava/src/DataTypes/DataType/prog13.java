package DataTypes.DataType;

import java.util.Scanner;

//Q: Count the Number of Digits in a Number
public class prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digit :");
        int N = sc.nextInt();

        int count = 0;
        while (N > 0) {
            N = N / 10;  // Remove last digit
            count++;     // Increase count
        }

        System.out.println("Number of digits: " + count);
    }
    
}
