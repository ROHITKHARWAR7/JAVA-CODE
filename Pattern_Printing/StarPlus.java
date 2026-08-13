import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         if (n % 2 == 0) {
    System.out.println("This pattern works only for odd numbers.");
} else {
    // Your pattern code

         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i == (n + 1) / 2 || j == (n + 1) / 2)
                    
                 System.out.print("*"+" ");
                 else System.out.print("  ");
            }
            // Move to the next line after one row is printed
            System.out.println();
        }

        sc.close();
    
    }}}
