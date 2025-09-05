public class PrimeUpto100 {
    public static void main(String[] args) {
        System.out.println("List of prime numbers from 1 to 100:");
        for (int number = 2; number <= 100; number++) {
            if (checkPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean checkPrime(int val) {
        for (int j = 2; j <= Math.sqrt(val); j++) {
            if (val % j == 0) {
                return false;
            }
        }
        return true;
    }
}
