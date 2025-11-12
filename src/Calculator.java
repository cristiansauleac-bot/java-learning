import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double first = scanner.nextDouble();
            System.out.print("Enter the operator (+ - * /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Enter second number: ");
            double second = scanner.nextDouble();

        double result;
        switch (operator) {
            case '+': result = first + second; break;
            case '-': result = first - second; break;
            case '*': result = first * second; break;
            case '/':
                if (second == 0) {
                    System.out.print("Cannot divide by 0\n");
                    scanner.close();
                    return;
                }
                result = first / second; break;
            default:
                System.out.print("Invalid operator\n");
                scanner.close();
                return;
        }

        System.out.print("Result: "+result);

        scanner.close();

    }
}
