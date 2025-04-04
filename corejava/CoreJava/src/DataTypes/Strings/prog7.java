package DataTypes.Strings;

import java.util.Scanner;

//Q.Validate an Email Address
public class prog7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Email");
        String str = sc.nextLine();

        if (str.contains("@") && str.endsWith(".com")) {
                System.out.println("Email is valid");
                  } else{
            System.out.println("Email is not valid");
        }
        
    
    }
    
}
