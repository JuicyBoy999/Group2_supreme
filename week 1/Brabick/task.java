/*
public class task {
    public static void main(String[] args) {
        for (int i = 2; i < 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i+ " ");
            }
        }
    }
}
*/

/*
import java.util.Scanner;
public class task {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
*/

/*
public class task {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz ");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            }
        }
    }
}
*/

/*
import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number" +i+ ": ");
            int num = sc.nextInt();
            if (num % 2 == 0 && num > 20) {
                System.out.println(num + " is even and greater than 20");
            }
        }
    }
}
*/

/* 
public class task {
    public static void main(String[] args) {
        int even = 0;
        int odd = 1;
        for (int i =1; i <= 10; i++) {
            if (i % 2 == 0) {
                even += i;
            }
            else {
                odd *= i;
            }
        }
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Product of odd numbers: " + odd);
    }
}
*/

/*
public class task {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i == 15) {
                System.out.println("skip");
            }
            else if (i % 4 == 0) {
                int d = i + i;
                System.out.println(i + " is divisible by 4 and its double is: " + d);
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("done");
    }
}
*/

import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        int password = 1234;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter your password: ");
            int passwordInput = sc.nextInt();
            if (passwordInput == password) {
                System.out.println("Access Granted");
                break;
            }
            else if (i == 3) {
                System.out.println("Account locked");
            }
            else {
                System.out.println("Incorrect PIN, try again");
            }
        }
    }
}
