import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        double z;
        double sum;
        double avg;

        System.out.print("Input 3 numbers: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();

        sum = x+y+z;
        avg = (x+y+z) /3;

        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);


      scanner.close();

    }
}