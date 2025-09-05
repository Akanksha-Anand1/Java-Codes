import java.util.Scanner;
public class Factorial {

    public static long findFactorial(int x) {
        if (x <= 0) {
            return 1;
        }
        return x * findFactorial(x - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        long result = findFactorial(value);
        System.out.println("The factorial of " + value + " = " + result);

        scanner.close();
    }
}