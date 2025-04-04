package DataTypes.DataType;

import java.util.Scanner;

//Q: Sum of Digits of a Number
public class prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the number: ");
            int N = sc.nextInt();
         
            int Sum = 0;
            while (N > 0) {
            int lastdigit = N % 10; //Extracts the last digit.
            Sum += lastdigit;       //Adds the last digit to Sum.
            N = N / 10;             //Removes the last digit from N.
        }
        System.out.println("Sum of digits: " + Sum);  
    }
    
}
