import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){

        double Balance = 1000;

        while(true) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showFunds(Balance);
                    break;

                case 2:
                    Balance += deposit();
                    break;

                case 3:
                    Balance -= withdrawal(Balance);
                    break;

                case 4:
                    System.out.println("***************");
                    System.out.println("EXIT");
                    scanner.close();
                    return;


                default:
                    System.out.println("Please enter a valid choice (1-4)");
                    break;
            }
        }
    }

    static void showFunds(double Balance){
        System.out.println("***************");
        System.out.println("Your balance is: ");
        System.out.printf("$%.2f\n", Balance);
    }
    static double deposit(){
        while(true) {
            System.out.println("Enter the amount you want to deposit: ");
            double depositAmt = scanner.nextDouble();
            if (depositAmt < 0) {
                System.out.print("Deposited amount can't be negative. Please try again.\n");
            } else {
                System.out.println("Deposit successful");
                return depositAmt;
            }
        }
    }
    static double withdrawal(double Balance){
        while(true) {
            System.out.println("Enter the amount you want to withdraw: ");
            double withdrawalAmt = scanner.nextDouble();
            if(withdrawalAmt<0){
                System.out.print("Withdrawal amount can't be negative. Please try again.\n");
                return 0;
            }
            else if(withdrawalAmt>Balance){
                System.out.print("Insufficient funds.\n");
            }
            else {
                System.out.println("Withdrawal successful");
                return withdrawalAmt;
            }
        }
    }
}
