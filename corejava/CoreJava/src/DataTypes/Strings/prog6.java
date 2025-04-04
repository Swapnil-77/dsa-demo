package DataTypes.Strings;

import java.util.Scanner;

//Q.Count Vowels & Consonants in a String
public class prog6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase(); // Convert to lowercase

        int vowelCount = 0, consonantCount = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } 
            // Check if character is a consonant (letter but not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
          // Print result
          System.out.println("Vowels: " + vowelCount);
          System.out.println("Consonants: " + consonantCount);
          
    }
    
}
