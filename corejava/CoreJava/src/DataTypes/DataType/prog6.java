package DataTypes.DataType;
// Q.Swap two numbers without a third variable.
public class prog6 {
    public static void main(String[] args) {
         // Swapping logic
        int a = 5;
        int b = 3;

         a = a + b;
         b = a - b;  // (b become otoginal a)
         a = a - b;  // (a become original b) 
         
         System.out.println("After Swappning:a = " + a + ", b = " + b);

         // USING MULTIPLICATION AND DIVISION
         int c = 8;
         int d = 4;
 
          c = c * d;
          d = c / d;  // (b become otoginal a)
          c = c / d;  // (a become original b) 
          
          System.out.println("After Swappning:a = " + c + ", b = " + d);

    }
    
}
