package DataTypes.Strings;

import java.util.Scanner;

//Q.Convert a String to Uppercase and Lowercase
public class prog4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        System.out.println("Uppercase: " + str.toUpperCase()); // Convert to uppercase
        System.out.println("Lowercase: " + str.toLowerCase()); // Convert to lowercase
        
    }
    
}
