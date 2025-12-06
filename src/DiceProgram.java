import java.util.Scanner;
import java.util.Random;

public class DiceProgram {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int total = 0;

        System.out.print("Enter the number of dice you want to roll: ");
        int nrOfRolls = scanner.nextInt();

        if(nrOfRolls>0){
            for(int i=0; i < nrOfRolls; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Your total is: " + total);
        }
        else{
            System.out.print("Please enter a valid amount.");
        }
        scanner.close();
    }

    static void printDie(int roll){

        String dice1 = """
                 _________
                |         |
                |    ●    |
                |         |
                 _________
                """;
        String dice2 = """
                 _________
                |  ●      |
                |         |
                |       ● |
                 _________
                """;
        String dice3 = """
                 _________
                |  ●      |
                |    ●    |
                |      ●  |
                 _________
                """;
        String dice4 = """
                 _________
                | ●     ● |
                |         |
                | ●     ● |
                 _________
                """;
        String dice5 = """
                 _________
                | ●     ● |
                |    ●    |
                | ●     ● |
                 _________
                """;
        String dice6 = """
                 _________
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 _________
                """;
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }

    }
}
