package DataTypes.DataType;

import java.util.Scanner;

//Q. Print Numbers from 1 to N
public class prog10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            System.out.print(i+" ");
        }
    }
    
}
