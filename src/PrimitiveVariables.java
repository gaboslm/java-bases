public class PrimitiveVariables {

    public static void main(String[] args) {
        // Primitive Variables
        String name = "John Doe";
        char firstNameLetter = 'J';
        int age = 26;
        boolean isMale = true;
        float cash = 10.5f;

        String genre = isMale ? "Male" : "Female";
        String pronoun = isMale ? "He" : "She";
        String determiner = isMale ? "His" : "Her";

        System.out.println(pronoun +" is "+ name);
        System.out.println(determiner +" first name letter is "+ firstNameLetter);
        System.out.println(pronoun +" is "+ age);
        System.out.println(determiner +" genre is " + genre);
        System.out.println(pronoun +" has "+ cash + " in " + determiner.toLowerCase() + " pocket");
    }
}
