import java.util.Scanner;

public class SquareofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int x = sc.nextInt();
        System.out.print(" Square is : ");
        System.out.print(x*x);
        sc.close();
    }
    
}
