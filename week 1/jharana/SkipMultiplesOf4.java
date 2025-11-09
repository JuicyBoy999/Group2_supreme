 import java.util.Scanner;

public class SkipMultiplesOf4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Numbers from 1 to " + number + " (skipping multiples of 4):");

        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0) {
                continue; 
            }
            System.out.print(i+ " ");
        }

        input.close();
    }
}


