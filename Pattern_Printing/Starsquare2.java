import java.util.Scanner;

public class Starsquare2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(i+" ");//isme sirf row print krna hai thats why we are taking i 
            }
            // Move to the next line after one row is printed
            System.out.println();
        }
    }
    
}
