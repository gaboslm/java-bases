import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {
        final double IVA_TAX = 0.16;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to calculate taxes: ");
        double amount = scanner.nextDouble();

        double amountWithTax = amount * IVA_TAX;
        double total = amount + amountWithTax;


        System.out.println("For $" + amount + " IVA is $" + amountWithTax + " for a total of $" + total);
    }
}

