import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
       System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 0)
            System.out.println(x);
        else
        System.out.println(-x);
    sc.close();

    }
    
}
