import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Declare the scanner object
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Give your First Number (in format x.x): ");
            double n1 = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("\nGive your Second Number (in format x.x): ");
            double n2 = Double.parseDouble(scanner.nextLine().trim());

            int choice = 0;
            try {
                System.out.println("\nWhat do you wish to do?\n");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.print("\nSelect 1, 2, 3 or 4: ");
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException nfe) {
                System.out.println("\nPlease enter a CORRECT choice!\n");
                continue; // Restart the loop if choice is incorrect
            }

            switch (choice) {
                case 1:
                    double Added = (n1 + n2);
                    double AddroundOff = (double) Math.round(Added * 100) / 100;
                    System.out.println("Addition of Given Numbers = " + AddroundOff);
                    break;

                case 2:
                    double Subtracted = (n1 - n2);
                    double SubroundOff = (double) Math.round(Subtracted * 100) / 100;
                    System.out.println("Subtraction of Given Numbers = " + SubroundOff);
                    break;

                case 3:
                    double Multiplied = (n1 * n2);
                    double XroundOff = (double) Math.round(Multiplied * 100) / 100;
                    System.out.println("Multiplication of Given Numbers = " + XroundOff);
                    break;

                case 4:
                    if (n2 != 0) { // Check to avoid division by zero
                        double Divided = (n1 / n2);
                        double DivroundOff = (double) Math.round(Divided * 100) / 100;
                        System.out.println("Division of Given Numbers = " + DivroundOff);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
                    break;
            }

            continueCalculation = retry(scanner);
        }

        scanner.close(); // Close the scanner object
    }

    public static boolean retry(Scanner scanner) {
        System.out.println("Would you like to try some other method? (1 for Yes, 2 for No)");
        int retrychoice = Integer.parseInt(scanner.nextLine().trim());
        return retrychoice == 1;
    }
}
