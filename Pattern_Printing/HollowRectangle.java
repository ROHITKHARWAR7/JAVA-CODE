import java.util.Scanner;

public class HollowRectangle {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1 | i==m |j==1|j==n) 
                    
                
                System.out.print(" *");
                else System.out.print("  ");
            }
            // Move to the next line after one row is printed
            System.out.println();
        }

        sc.close();
    }
}
