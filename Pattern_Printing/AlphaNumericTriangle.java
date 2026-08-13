import java.util.Scanner;

public class AlphaNumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {   // Odd row -> Numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {            // Even row -> Alphabets
                for (int j = 1; j <= i; j++) {
                    System.out.print((char)(64 + j) + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}