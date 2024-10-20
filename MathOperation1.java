import java.lang.Math;

public class MathOperation1 {
    public static void main(String[] args) {
        double a = 3.15;
        double b = 4;
        double c = 3;

        double numerator = Math.abs((a / (b * c)) + a + c * Math.log(a));
        double denumerator = 20 * a - Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
        double x = a + (numerator / denumerator);

        double y = a * (Math.atan(c) + Math.exp(b + 1));

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}