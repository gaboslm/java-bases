import java.util.Scanner;

public class MovieRenderCalculator {

    public static void main(String[] args) {
        // Movie Render Calculator
        final double COST_PER_MINUTE = 50;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ënter the total of minutes to render the movie: ");
        double minutes = scanner.nextDouble();

        double totalCost = COST_PER_MINUTE * minutes;

        System.out.println("The total cost to render the movie is $" + totalCost);

    }
}
