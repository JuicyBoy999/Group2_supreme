import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int CorrectPIN=1234;
        int attempts=3;
        for (int i=1; i<=attempts;i++){
            System.out.println("Enter your PIN: ");
            int enteredPIN=sc.nextInt();
            if (enteredPIN==CorrectPIN){
                System.out.println("Access Granted");
                break;
            }else {
                if (i<attempts){
                    System.out.println("Incorrect PIN, try again");
                } else {
                    System.out.println("Account Locked");
                }
            }
        }
    }
}


