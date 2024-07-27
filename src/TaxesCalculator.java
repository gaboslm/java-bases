import java.util.Scanner;

public class TaxesCalculator {

    public static void main(String[] args) {
        // Iva Calculator
        final float IVA_TAX = 0.16f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to calculate taxes: ");
        float amount = scanner.nextFloat();

        float amountWithTax = amount * IVA_TAX;
        float total = amount + amountWithTax;

        System.out.println("For $" + amount + " IVA is $" + amountWithTax + " for a total of $" + total);
    }
}

