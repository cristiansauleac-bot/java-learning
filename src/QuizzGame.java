import java.util.Scanner;

public class QuizzGame {
    public static void main (String[] args){

        String[] questions = {" What is the capital of Romania?",
                              " What was the first programming language?",
                              " What is the main function of a router?",
                              " Which part of the computer is considered the brain?",
                              " What year was facebook launched?"};

        String[][] options = {{"1. Bucharest", "2. Cluj-Napoca", "3. Iasi", "4. Chisinau"},
                              {"1. Java", "2. C++", "3. C#", "4. Fortran"},
                              {"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. GPU", "2. RAM", "3. CPU", "4. SSD"},
                              {"1. 2000" , "2. 2004", "3. 2006", "4. 2008"}};

        int[] answers = {1, 4, 3, 3, 2};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("*************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your answer: ");
            guess = scanner.nextInt();

            if(guess == answers[i]) {
                System.out.println("**************************");
                System.out.println("That's the correct answer!");
                System.out.println("**************************\n");
                score++;
            }
            else{
                System.out.println("*************");
                System.out.println("Wrong answer!");
                System.out.println("*************\n");
            }

        }
        System.out.println("Your score is: " + score + "/5");

        scanner.close();

    }
}
