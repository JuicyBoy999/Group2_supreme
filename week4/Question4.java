import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for (int i = 1; i<= 10; i++){
            System.out.println("Enter number "+i+":");
            int number = sc.nextInt();

        if (number%2==0 && number>20) {
            System.out.println(number + "is even and greater than 20");
            }
        }
    }
}

