package DataTypes.Strings;

import java.util.Scanner;

//Q.Count the Number of Words in a String
public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("Word count: 0");
        } else{
            String[] words = str.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
    }
    
}
