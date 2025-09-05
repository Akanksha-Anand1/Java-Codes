import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        int[] sequence = new int[terms];
        
        // First two values
        sequence[0] = 0;
        sequence[1] = 1;

        // Generate sequence
        for (int j = 2; j < terms; j++) {
            sequence[j] = sequence[j - 1] + sequence[j - 2];
        }
        
        // Display output
        System.out.println("Fibonacci Numbers:");
        for (int k = 0; k < terms; k++) {
            System.out.print(sequence[k] + " ");
        }
        scanner.close();
    }
}

