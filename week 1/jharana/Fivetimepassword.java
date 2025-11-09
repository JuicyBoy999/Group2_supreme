import java.util.Scanner;

public class Fivetimepassword {
    public static void main(String[] args) {
        final String CORRECT_PASSWORD = "12345";
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter password (attempt " + i + "): ");
            String password = sc.nextLine();

            if (password.equals(CORRECT_PASSWORD)) {
                System.out.println("Password matched!");

                if (i == 3) {
                    System.out.println("Matched on 3rd attempt. program stopped.");
                    break; 
                }
            } else {
                System.out.println("Password not matched.");
            }
        }
        sc.close();

 }
}

