import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cp, sp;

        System.out.print("Enter cost price: ");
        cp = sc.nextInt();

        System.out.print("Enter selling price: ");
        sp = sc.nextInt();

        if (sp > cp) {
            int profit = sp - cp;
            int profitpercentage = (profit * 100) / cp;

            System.out.println("Profit");
            System.out.println("Profit % = " + profitpercentage);
        } 
        else if (cp > sp) {
            int loss = cp - sp;
            int losspercent = (loss * 100) / cp;

            System.out.println("Loss");
            System.out.println("Loss % = " + losspercent);
        } 
        else {
            System.out.println("No Profit No Loss");
            sc.close();
        }
    }
}