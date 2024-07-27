import java.util.Scanner;

public class LogicOperators {

    public static void main(String[] args) {
        final int AGE_OF_MAJORITY = 18;
        System.out.println("Enter your current age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age >= AGE_OF_MAJORITY){
            System.out.println("You are major");
        }else{
            System.out.println("You are minor");
        }
    }
}
