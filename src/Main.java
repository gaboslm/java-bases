import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello world!");

        // Variables
        String name = "John Doe";
        char firstNameLetter = 'J';
        int age = 26;
        boolean isMale = true;
        double cash = 10.5;

        String genre = isMale ? "Male" : "Female";
        String pronoun = isMale ? "He" : "She";
        String determiner = isMale ? "His" : "Her";

        System.out.println(pronoun +" is "+ name);
        System.out.println(determiner +" first name letter is "+ firstNameLetter);
        System.out.println(pronoun +" is "+ age);
        System.out.println(determiner +" genre is " + genre);
        System.out.println(pronoun +" has "+ cash + " in " + determiner.toLowerCase() + " pocket");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your girl character name: ");
        String character = scanner.nextLine();

        String shortStory = "In the heart of an ancient forest, where the trees whispered secrets to the winds and the streams sang ancestral melodies, lived a little girl named " + character + ". She had eyes that reflected the depth of the night sky and a laugh that could make the most reluctant flowers bloom. One day, while exploring a clearing bathed in the golden light of the sun, she found a strange amulet buried under an old, gnarled oak tree. Unknowingly, " + character + " had unearthed a magical artifact that contained the power to control time.\n" +
                "\n" +
                "Intrigued by her discovery, " + character + " took the amulet home and began to experiment with it. At first, the effects were small: a clock that ticked a bit faster or a flower that wilted and then bloomed again. But over time, she discovered that she could go back to specific moments in her life and alter them. One afternoon, she decided to use the amulet to prevent her best friend, a little fox named Nilo, from hurting his paw by falling off a hill. However, every time she changed an event, something unexpected happened. The butterflies that once fluttered happily disappeared, and the birds stopped singing.\n" +
                "\n" +
                "With a heavy heart, " + character + " realized that each change she made to the past had consequences in the present. The forest, once vibrant and full of life, began to wither. She then decided to return the amulet to its resting place under the ancient oak tree. In doing so, the forest regained its vitality, and the creatures resumed their usual melodies. " + character + " learned that time, with all its ups and downs, was perfect as it was and that every experience, good or bad, had its purpose. From that day on, she lived appreciating every moment and teaching others to do the same, knowing that the true power was not in changing the past but in accepting and learning from it.";

        System.out.println(shortStory);
    }

}
