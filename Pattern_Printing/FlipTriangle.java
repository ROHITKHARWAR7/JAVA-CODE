import java.util.Scanner;

public class FlipTriangle {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n+1-i ; j++) {//this is staandard math templets with the use of math 
                System.out.print("*"+" ");//AGAR ALPHABET KRNI HAI H ULTI THEN WE USE CHAR HERE
            }
            // Move to the next line after one row is printed
            System.out.println();
    
}
     }
}
//agar math use na krna ho then make a temp
// import java.util.Scanner;

// public class FlipTriangle {
//       public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = n; // no of star printed in each line 
//          for (int i = 1; i<= n; i++) {
//             for (int j = 1; j<=a ; j++) {
//                 System.out.print("*"+" ");
//             }
//             a--;
//             // Move to the next line after one row is printed
//             System.out.println();
    
// }
//      }
// }