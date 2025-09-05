import java.util.Scanner;

public class TrafficLightSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter signal state (1 = Red, 2 = Yellow, 3 = Green): ");
        int light = input.nextInt();

        switch (light) {
            case 1:
                System.out.println("RED : Please STOP");
                break;
            case 2:
                System.out.println("YELLOW : Get Ready / Slow Down");
                break;
            case 3:
                System.out.println("GREEN : You may GO");
                break;
            default:
                System.out.println("Wrong choice! Enter only 1, 2 or 3.");
        }

        input.close();
    }
}
