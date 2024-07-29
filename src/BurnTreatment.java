import java.util.Scanner;

public class BurnTreatment {

    public static void main(String[] args) {
        final int FIRST_GRADE = 1;
        final int SECOND_GRADE = 2;
        final int THIRD_GRADE = 3;

        System.out.println("First you have to recognize what type of Show burn is");
        System.out.println("- First grade:");
        System.out.println("redness, mild pain and possible swelling");
        System.out.println("- Second grade:");
        System.out.println("blisters, redness, severe pain and swelling");
        System.out.println("- Third grade");
        System.out.println("charred skin, numb area and potentially serious swelling and tissue damage");

        System.out.println("Enter the type of burn?");
        System.out.println("1) First grade");
        System.out.println("2) Second grade");
        System.out.println("3) Third grade");

        Scanner scanner = new Scanner(System.in);
        final int choice = scanner.nextInt();

        if(choice == FIRST_GRADE){
            System.out.println("Treatment:");
            System.out.println("1. Run cool water over the burn for 5-10 minutes.");
            System.out.println("2. Use aloe vera or a moisturizer to soothe the skin.");
            System.out.println("3. Use a sterile, non-stick bandage if necessary to protect the area.");
        } else if(choice == SECOND_GRADE) {
            System.out.println("Treatment:");
            System.out.println("1. Run cool water over the burn for 15-20 minutes.");
            System.out.println("2. Apply antibiotic ointment, cover with a sterile, non-stick bandage.");
            System.out.println("3. Watch for infection, manage pain, and seek medical help if necessary.");
        } else if(choice == THIRD_GRADE) {
            System.out.println("Treatment:");
            System.out.println("1. Call emergency services or go to the nearest ER");
            System.out.println("2. Leave any clothing stuck to the burn; remove other clothing gently.");
            System.out.println("3. Cover the burn with a cool, moist, sterile bandage or clean cloth.");
        } else{
            System.out.println("You has not selected a correct option");
        }
    }
}
