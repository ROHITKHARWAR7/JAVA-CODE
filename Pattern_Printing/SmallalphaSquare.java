import java.util.Scanner;

public class SmallalphaSquare {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            System.out.print((char)(j+96)+" ");//agar j ke jagah i rhega to sirf row print hoga ek  bar me like aaaa bbbb cccc
        }
System.out.println();
    }
}
}
