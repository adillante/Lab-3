import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient a cannot be zero.");
            return;
        }

        double delta = b * b - 4 * a * c;

        int roots;

        if (delta > 0) {
            roots = 2;
        } else if (delta == 0) {
            roots = 1;
        } else {
            roots = 0;
        }

        switch (roots) {

            case 2:
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);

                System.out.printf("x1 = %.2f%n", x1);
                System.out.printf("x2 = %.2f%n", x2);
                break;

            case 1:
                double x = -b / (2 * a);

                System.out.printf("x = %.2f%n", x);
                break;

            case 0:
                System.out.println("No real roots.");
                break;
        }

        scanner.close();
    }
}