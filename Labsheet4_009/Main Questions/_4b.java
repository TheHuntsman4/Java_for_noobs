import java.util.Scanner;

public class _4b{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the state of the switches
        System.out.print("Enter the state of the switch at the top (1 for on, 0 for off): ");
        int topSwitch = input.nextInt();

        System.out.print("Enter the state of the switch at the bottom (1 for on, 0 for off): ");
        int bottomSwitch = input.nextInt();

        // Call the light_state method and display the result
        boolean lightOn = light_state(topSwitch, bottomSwitch);
        System.out.println("The lights over the staircase are turned " + (lightOn ? "on" : "off"));
    }

    // Implementation using switch statement
    public static boolean light_state(int topSwitch, int bottomSwitch) {
        switch (topSwitch) {
            case 1:
                switch (bottomSwitch) {
                    case 0:
                        return true; // Lights are turned on
                    case 1:
                        return false; // Lights are turned off
                    default:
                        break;
                }
                break;
            case 0:
                switch (bottomSwitch) {
                    case 0:
                        return false; // Lights are turned off
                    case 1:
                        return true; // Lights are turned on
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return false; // Default case, lights are turned off
    }
}

