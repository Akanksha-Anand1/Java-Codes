import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter year
        System.out.print("Enter any year: ");
        int yr = input.nextInt();

        if (yr % 4 == 0) {
            if (yr % 100 == 0) {
                if (yr % 400 == 0) {
                    System.out.println(yr + " is Leap Year");
                } else {
                    System.out.println(yr + " is Not a Leap Year");
                }
            } else {
                System.out.println(yr + " is Leap Year");
            }
        } else {
            System.out.println(yr + " is Not a Leap Year");
        }

        input.close();
    }
}