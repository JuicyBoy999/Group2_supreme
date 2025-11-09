import java.util.Scanner;

public class ATMPinVerification {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        Scanner input = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = input.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Access Granted");
                return; // Stop the program after correct PIN
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Incorrect PIN, try again.");
                }
            }
        }

        System.out.println("Account locked");
        input.close();
    }
}


