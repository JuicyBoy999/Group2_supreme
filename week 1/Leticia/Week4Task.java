// Question 1

/* public class Week4Task {
    public static void main(String[] args) {
        for(int i = 1; i < 51; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    continue;
                }
                else {
                    System.out.print(i + ", ");
                }
            }
            else if (i % 5 == 0) {
                if (i % 3 == 0) {
                    continue;
                }
                else {
                    System.out.print(i + ", ");
                }
            }
        }
    }
} */


// Question 2

/* import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i < n+1; i++) {
            if (i % 4 == 0) {
                continue;
            }
            else {
                System.out.print(i + ", ");
            }
        }
    }
} */


// Question 3

/* public class Week4Task {
    public static void main(String[] args) {
        for(int i = 1; i < 31; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FizzBuzz ");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }
        }
    }
} */


// Question 4

/* import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "";

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number:");
            int n = sc.nextInt();

            if ((n % 2 == 0) && (n > 20)) {
                user = user + n + " ";
            }
        }
        System.out.println(user);
    }
} */

// Question 5

/* public class Week4Task {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        for(int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
            else {
                product *= i;
            }
        }
        System.out.println("Sum of even numbers = " + sum);
        System.out.println("Product of odd numbers = " + product);
    }
} */


// Question 6

/* public class Week4Task {
    public static void main(String[] args) {
        for(int i = 1; i < 31; i++) {
            if (i == 15) {
                System.out.println("Skip ");
            }
            else if (i % 4 == 0) {
                System.out.println(i * 2);
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("Done");
    }
} */

// Question 7

import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        int pin = 1234;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("enter the pin:");
            int password = sc.nextInt();

            if (password == pin) {
                System.out.println("Access Granted");
                break;
            }
            else if (i == 2) {
                System.out.println("Account locked");
            }
            else {
                System.out.println("Incorrect PIN, try again");
            }
        }
    }
}