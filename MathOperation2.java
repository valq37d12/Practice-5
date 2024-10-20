import java.util.Scanner;

public class MathOperation2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть значення а: ");
        double a = input.nextDouble();

        System.out.println("Введіть значення b: ");
        double b = input.nextDouble();

        System.out.println("Введіть значення x: ");
        double x = input.nextDouble();

        double result = 0.0;

        if (x < 4) {
            result = Math.cos(x);
        } else if (x == 4) {
            result = Math.pow(x, 3) - (b * x) + 1;
        } else if (x > 4 && x < 7) {
            result = Math.sqrt(a * x);
        }

        System.out.println("Значення функції f(x) дорівнює: " + result);

        input.close();
    }
}