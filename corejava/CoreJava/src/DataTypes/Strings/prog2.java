package DataTypes.Strings;

import java.util.Scanner;

//Q. Check if a String is a Palindrome.
public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString(); // Reverse the string

        if (str.equals(reversed)) {
            System.out.println("Yes, it's a palindrome");
        } else {
            System.out.println("No, it's not a palindrome");
        }
    


    }
    
}
