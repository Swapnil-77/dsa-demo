package DataTypes.DataType;
//Q.Check if a number is even or odd.
import java.util.Scanner;

//Q.Check if a number is even or odd.
public class prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number:");
    int num = sc.nextInt();

    // check if it is even or odd
    if (num % 2 == 0) {
        System.out.println(num + " is even number");
    }
        else{
            System.out.println(num + " is odd number");
        }

    }
    
}
