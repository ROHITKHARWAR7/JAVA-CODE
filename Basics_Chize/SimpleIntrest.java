import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner rohit = new Scanner(System.in);//scanner rohit liya hai to niche bhi rohit rhega kyuki scanner ka nam rohit hai
        int p = rohit.nextInt();
        int r = rohit.nextInt();
        int t = rohit.nextInt();
        double si = p*r*t/100 ;
        System.out.println(si);
        rohit.close();
    }
    
}
