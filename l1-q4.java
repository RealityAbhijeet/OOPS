import java.util.Scanner;
public class ProfitCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double costPrice = input.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sellingPrice = input.nextDouble();
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;
        System.out.println("Cost Price = " + costPrice);
        System.out.println("Selling Price = " + sellingPrice);
        System.out.println("Profit = " + profit);
        System.out.println("Profit Percentage = " + profitPercent + "%");
        input.close();
    }
}
