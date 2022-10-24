import java.util.*;
import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        System.out.println("Enter your operator");

        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);

                break;
            case '-':
                System.out.println(a - b);

                break;
            case '*':
                System.out.println(a * b);

                break;
            case '/':
                System.out.println(a / b);

                break;
            case '%':
                System.out.println(a % b);

                break;
            default:
                System.out.println("Wrong Operator");
                break;
        }

    }
}
