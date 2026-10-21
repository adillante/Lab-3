import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float firstNumberBielecki = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float secondNumberBielecki = scanner.nextFloat();

        float sum = firstNumberBielecki + secondNumberBielecki;
        float difference = firstNumberBielecki - secondNumberBielecki;
        float product = firstNumberBielecki * secondNumberBielecki;
        float quotient = firstNumberBielecki / secondNumberBielecki;

        System.out.printf("Sum = %.2f%n", sum);
        System.out.printf("Difference = %.2f%n", difference);
        System.out.printf("Product = %.2f%n", product);
        System.out.printf("Quotient = %.2f%n", quotient);

        scanner.close();
    }
}