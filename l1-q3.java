import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        double miles = km * 0.621371;   // Correct conversion formula
        System.out.println("Distance in miles is " + miles);
        input.close();
    }
}
