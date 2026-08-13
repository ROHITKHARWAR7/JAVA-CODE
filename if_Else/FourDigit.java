import java.util.Scanner;

public class FourDigit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int n = sc.nextInt();
    if (n>999 && n>1000)
        System.out.println("It is four digit number ");
    else 
        System.out.println("It is not four digit number ");
         sc.close();
    }
    
}
