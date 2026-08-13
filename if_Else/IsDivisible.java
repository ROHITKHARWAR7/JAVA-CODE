import java.util.Scanner;

public class IsDivisible {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        if (a%3==0 && a%5==0)
            System.out.println("Number is divisible by 5 and 3");
         else if (a%5==0)
        System.out.println("Number is only divisible by 5");
         else if (a%3==0)
        System.out.println("Number is only divisible by 3");
else 
    System.out.println("Not divisible by 5 and 3");
    sc.close();
}
}
