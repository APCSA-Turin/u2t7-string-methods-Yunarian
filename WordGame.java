import java.util.Scanner;

public class WordGame {

    public static void main(String[] args) {
        // initializing variables; words starts at 1 as it isn't incremented for the first inputed word.
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int words = 1;
        String typedWord;
        
        System.out.print("Type a string to initialize the word game: ");
        String initialWord  = scan.nextLine();

        // while loop in which the entire program runs
        while (score < 50) {
            System.out.print("Type a string to be compared to the one prior: ");
            typedWord = scan.nextLine();

            // comparing the new word to the old word and seeing if the new word is alphabetically ahead, behind, or the same
            if (typedWord.compareTo(initialWord) > 0) {
                System.out.println(" +2 points");
                score += 2;

            } else if (typedWord.compareTo(initialWord) < 0) {
                System.out.println(" -5 points");
                score -= 5;

            } else {
                System.out.println(" -10 points");
                score -= 10;
            }

            // Checking if the last 2 letters of the old word are the start of the new word
            if (initialWord.substring(initialWord.length() - 2).equals(typedWord.substring(0, 2))) {
                System.out.println(" +5 points");
                score += 5;
            }

            // Checking if the first letter of the old word is present in the new word
            if (typedWord.indexOf(initialWord.substring(0, 1)) != -1) {
                System.out.println(" +3 points");
                score += 3;
            }

            // things which should always run after each loop
            initialWord = typedWord;
            words++;
        }

        // while loop end text
        scan.close();
        System.out.println("Congrats, you won in " + words + " words.");
    }
}
