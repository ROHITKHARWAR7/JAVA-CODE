import java.util.Scanner;
public class OddEven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        if (x%2==0)
        System.out.print("even");
        else
        System.out.print("odd");  
    sc.close();  

    }

    
}
