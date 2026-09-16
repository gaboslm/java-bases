import java.util.Scanner;

public class HeartRate {

    public static void main(String[] args) {
        final int MALE = 1;

        final int SEDENTARY = 1;
        final int MODERATE = 2;
        final int ACTIVE = 3;

        final int MALE_HEART_RATE = 220;
        final int FEMALE_HEART_RATE = 220;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your activity level: ");
        System.out.println("1) Sedentary");
        System.out.println("2) Moderate");
        System.out.println("3) Active");
        int activityLevel = scanner.nextInt();

        System.out.println("Enter your genre: ");
        System.out.println("1) Male");
        System.out.println("2) Female");
        int genre = scanner.nextInt();
        boolean isMale = genre == MALE;

        int maxHeartRate;
        if (isMale) {
            maxHeartRate = MALE_HEART_RATE - age;
        } else {
            maxHeartRate = FEMALE_HEART_RATE - age;
        }
        System.out.println("Max heart rate: " + maxHeartRate);

        float minRange = 0;
        float maxRange = 0;
        if (activityLevel == SEDENTARY) {
            minRange = maxHeartRate * 0.5f;
        } else if (activityLevel == MODERATE) {
            minRange = maxHeartRate * 0.6f;
        } else if (activityLevel == ACTIVE) {
            minRange = maxHeartRate * 0.7f;
        }
        maxRange = maxHeartRate * 0.85f;
        System.out.println("Target heart rate range is between " + minRange + " to " + maxRange + " beats per minute");

    }
}
