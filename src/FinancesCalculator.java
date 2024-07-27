import java.util.Scanner;

public class FinancesCalculator {

    public static void main(String[] args){

        // Finances Calculator
        final float NEEDS_PERCENTAGE = 0.5f;
        final float WISHES_PERCENTAGE = 0.3f;
        final float SAVING_PERCENTAGE = 0.2f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your net salary in USD: ");
        float salary = scanner.nextFloat();

        float needs = salary * NEEDS_PERCENTAGE;
        float wishes = salary * WISHES_PERCENTAGE;
        float saving = salary * SAVING_PERCENTAGE;

        System.out.println("You should spend your salary this way");
        System.out.println("$" + needs + " for needs");
        System.out.println("$" + wishes + " for wishes");
        System.out.println("$" + saving + " for saving");
    }
}
