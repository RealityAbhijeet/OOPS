import java.util.Scanner;
public class HarryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birthYear = 2000;
        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();
        int age = currentYear - birthYear;
        System.out.println("Harry's age is " + age);
        sc.close();
    }
}
