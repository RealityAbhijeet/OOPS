import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", 
                          celsius, fahrenheit);
        sc.close();
    }
}
