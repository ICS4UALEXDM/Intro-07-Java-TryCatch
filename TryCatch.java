import java.util.Scanner;
/**
* This program calculates the volume of a sphere.
*
* @author  Alex De Meo
* @version 1.0
* @since   2023/02/08
*/

public final class TryCatch {
    /**
    * This is a private constructor used to satisfy the
    * style checker.
    *
    * @exception IllegalStateException Utility Class
     */
    private TryCatch() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    */

    public static void main(String[] args) {
        // Creating the scanner.
        final Scanner scanner = new Scanner(System.in);

        // Getting the radius.
        System.out.print("Enter the radius of the sphere: ");
        final String radiusStr = scanner.nextLine();
        // Checking to ensure no error occurs.
        try {
            final double radiusDbl = Double.parseDouble(radiusStr);

            if (radiusDbl < 0) {
                System.out.println("Sorry but the radius cannot be negative.");
            } else {
                // Doing the math.
                final double volume = (
                    4 * Math.PI * (Math.pow(radiusDbl, 3))) / 3;

                // Final output to user.
                System.out.print("The volume of this");
                System.out.printf("sphere is %.2fcm^3 \n", volume);
            }
        // What to do if an error was caught.
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid radius. "
                + error.getMessage());
        }
    }
}
