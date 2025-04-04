package DataTypes.DataType;

import java.util.Scanner;

//Q.Find the Sum of First N Natural Numbers
public class prog11 {
    public static void main(String[] args) {
      
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the number: ");
            int N = sc.nextInt();
         
            int Sum = 0;
            for(int i=1; i<=N; i++){
                Sum += i;
            }

            System.out.println("The sum of first " + N +" natural number is : " +  Sum);


    }
}
