package DataTypes.Strings;

import java.util.Scanner;

//Q. Reverse a String → Without using StringBuilder.reverse().
public class prog1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length-1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
            
        }
        String reversedStr = new String(charArray);
        System.out.println("Reversed String: " + reversedStr);
    }
    
}
