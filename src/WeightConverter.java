import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        while (true) {


            System.out.print("Enter weight (kg or lbs): ");
            String weight = scanner.nextLine().trim().toLowerCase();

            if(weight.isEmpty()) {
                break;
            }

            if (weight.endsWith("kg")) {
                double kg = Double.parseDouble(weight.replace("kg", "").trim());
                double lbs = kg * 2.20462;
                System.out.printf("%.2f kg = %.2f lbs%n", kg, lbs);
            }
            else if (weight.endsWith("lbs") || weight.endsWith("lb")) {
                double lbs = Double.parseDouble(weight.replace("lbs", "").replace("lb", "").trim());
                double kg = lbs / 2.20462;
                System.out.printf("%.2f lbs = %.2f kg%n", lbs, kg);
            }
            else {
                System.out.print("Please enter a valid weight\n");
            }
        }

scanner.close();
    }
}
