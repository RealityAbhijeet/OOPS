import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, temp;
        System.out.print("Enter first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        number2 = sc.nextInt();
        System.out.println("Before Swapping: " + number1 + " and " + number2);
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After Swapping: " + number1 + " and " + number2);
        sc.close();
    }
}
