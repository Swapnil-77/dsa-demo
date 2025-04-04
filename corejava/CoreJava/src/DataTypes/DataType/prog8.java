package DataTypes.DataType;

import java.util.Scanner;

// Q.Find the largest of three numbers.
public class prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.println("Enter the number :");
        int a = sc.nextInt();

        System.out.println("Enter the number :");
        int b = sc.nextInt();

        System.out.println("Enter the number :");
        int c = sc.nextInt();

        //finding the largesy number
        int largest;
         if (a >= b && a >= c) {
            largest = a;
            
         } else if (b >= a && b >= c) {
            largest = b;
            
         } else {
            largest = c;
         }

         //printing the largest num
         System.out.println("The largest number is " + largest);



        
    }
    
}
