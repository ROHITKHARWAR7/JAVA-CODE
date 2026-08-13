import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of Rectangle: ");
    int l = sc.nextInt();
    System.out.print("Enter breadth of Rectangle: ");
    int b= sc.nextInt();
    if (l*b > 2*(l+b))
        System.out.println("Area is greater than perimeter");
    else if (l*b < 2*(l+b))
        System.out.println("Perimeter is greater than area");
    sc.close();

}
}