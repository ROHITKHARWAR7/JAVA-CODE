import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input le rhe yha 

        System.out.print("Enter radius: ");  //  ok

        double r = sc.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("Area = " + area);
        sc.close();
    }
}