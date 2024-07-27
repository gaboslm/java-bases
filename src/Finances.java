import java.util.Scanner;

public class Finances {

    public static void main(String[] args){
        // 50: Needs
        // 30: Wishes
        // 20: Saving

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your net salary in USD: ");
        double salary = scanner.nextDouble();

        double needs = salary * 0.5;
        double wishes = salary * 0.3;
        double saving = salary * 0.2;

        System.out.println("You should spend your salary this way");
        System.out.println("$" + needs + " for needs");
        System.out.println("$" + wishes + " for wishes");
        System.out.println("$" + saving + " for saving");
    }
}
