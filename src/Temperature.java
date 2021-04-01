import java.util.Scanner;

public class Temperature {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter fahrenheit: ");
                int f = scanner.nextInt();
                double f_C = fahrenheitToCelsius(f);
                System.out.println(f_C);
                break;
            case 2:
                System.out.println("Enter celsius: ");
                int c = scanner.nextInt();
                double c_F = celsiusToFahrenheit(c);
                System.out.println(c_F);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Not now");
        }
    }
}
