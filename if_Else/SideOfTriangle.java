import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter side 1: ");
    int a = sc.nextInt();
    
    System.out.print("Enter side 2: ");
    int b = sc.nextInt();
    
    System.out.print("Enter side 3: ");
    int c = sc.nextInt();
    if (a+b>c && b+c>a && a+c>b)
        System.out.println("Valid triangle");
    else
        System.out.println("not valid triangle");
       sc.close();
}
}
