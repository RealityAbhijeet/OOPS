import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1, number2;
        System.out.print("Enter first number: ");
        number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        number2 = sc.nextDouble();
        System.out.println("Addition = " + (number1 + number2));
        System.out.println("Subtraction = " + (number1 - number2));
        System.out.println("Multiplication = " + (number1 * number2));
        if (number2 != 0) {
            System.out.println("Division = " + (number1 / number2));
        } else {
            System.out.println("Division not possible (cannot divide by zero)");
        }
        sc.close();
    }
}
