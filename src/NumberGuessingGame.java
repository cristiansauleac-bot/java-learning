import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNr = random.nextInt(1, 101);
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!\n");

        while(true) {
            System.out.print("Enter a number between 1 and 100: ");
            int number = scanner.nextInt();
            attempts++;

            if (number < randomNr) {
                System.out.println("Number is too low");
            }
            else if (number > randomNr) {
                System.out.println("Number is too high");
            }
            else {
                System.out.println("You guessed the number! It's "+randomNr);
                System.out.println("You guessed it in "+attempts +" attempts");
                System.out.println("BYE!");
                break;
            }
        }
        scanner.close();
}
}
