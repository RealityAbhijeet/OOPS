import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, height, area;
        System.out.print("Enter base: ");
        base = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        if (base <= 0 || height <= 0) {
            System.out.println("Base and height must be positive numbers.");
        } else {
            area = 0.5 * base * height;
            System.out.printf("Area of triangle = %.2f\n", area);
        }
        sc.close();
    }
}
