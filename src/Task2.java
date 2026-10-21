import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        float heightBielecki = scanner.nextFloat();

        System.out.print("Enter your weight in kilograms: ");
        float weightBielecki = scanner.nextFloat();

        double bmi = weightBielecki / Math.pow(heightBielecki, 2);

        System.out.printf("Your BMI = %.2f%n", bmi);

        if (bmi < 16.0) {
            System.out.println("Starvation");
        } else if (bmi < 17.0) {
            System.out.println("Emaciation");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 23.0) {
            System.out.println("Normal, low range");
        } else if (bmi < 25.0) {
            System.out.println("Normal, high range");
        } else if (bmi < 27.5) {
            System.out.println("Overweight, low range");
        } else if (bmi < 30.0) {
            System.out.println("Overweight, high range");
        } else if (bmi < 35.0) {
            System.out.println("1st degree obesity");
        } else if (bmi < 40.0) {
            System.out.println("2nd degree obesity");
        } else {
            System.out.println("3rd degree obesity");
        }

        scanner.close();
    }
}