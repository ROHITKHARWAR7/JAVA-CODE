import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        double n = sc.nextDouble();// imgine kro yh pe 6.78 liy hai 
        int x = (int)n ; // yha p type casting ho rha jisse jo value double me hai vo integer bn jayega like 6 bn jayega 
        if (n-x==0)
            System.out.println("is integer");
    else
        System.out.println("not intgers");
        sc.close();
    }
    
}
