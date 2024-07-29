import java.util.Scanner;

public class RespirationRate {

    public static void main(String[] args) {
        final int MIN_NORMAL_RANGE = 12;
        final int MAX_NORMAL_RANGE = 20;

        System.out.println("Enter your respiration rate per minute (RPM)");
        Scanner scanner = new Scanner(System.in);
        int rpm = scanner.nextInt();

        if(rpm >= MIN_NORMAL_RANGE && rpm <= MAX_NORMAL_RANGE) {
            System.out.println("Your respiration rate per minute is normal");
        }
        else if(rpm < MIN_NORMAL_RANGE){
            System.out.println("Your respiration rate per minute is low");
        }
        else if(rpm > MAX_NORMAL_RANGE){
            System.out.println("Your respiration rate per minute is high");
        }
    }
}
