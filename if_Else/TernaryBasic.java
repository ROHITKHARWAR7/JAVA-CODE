import java.util.Scanner;

public class TernaryBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        // pahle hm if else ka use krte the kisi condition ko run krne ke liye but ternary me 1 line me hi code likhte h conditions ka
        // like condition -sach:jhooth
        System.out.println((a%2==0) ? "even" : "odd" );
        sc.close();
    }
    
}
