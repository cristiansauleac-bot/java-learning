import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playAgain = "yes";
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        int[][] results = {
                //  R   P   S
                  { 0, -1,  1}, // R
                  { 1,  0, -1}, // P
                  {-1,  1,  0}  // S
        };

        while (playAgain.equals("yes")){
            System.out.print("Enter your move (rock/paper/scissors): ");
            playerChoice = scanner.nextLine().trim().toLowerCase();

            while (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.print("Enter a valid move (rock/paper/scissors): ");
                playerChoice = scanner.nextLine().trim().toLowerCase();
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            int playerIndex = -1;
            int computerIndex = -1;

            for (int i = 0; i < choices.length; i++){
                if(playerChoice.equals(choices[i])){
                    playerIndex = i;
                }

                if(computerChoice.equals(choices[i])){
                    computerIndex = i;
                }
            }

            int outcome = results[playerIndex][computerIndex];

            if(outcome == 0){
                System.out.println("It's a draw!");
            } else if (outcome == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().toLowerCase();

            while (!playAgain.equals("yes") && !playAgain.equals("no")){
                    System.out.println("Invalid input!");
                    System.out.print("Play again? (yes/no): ");
                    playAgain = scanner.nextLine().trim().toLowerCase();
            }

            System.out.println();

        }

        scanner.close();

    }
}
