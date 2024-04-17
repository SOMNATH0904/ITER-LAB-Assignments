import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word to search for:");
        String searchWord = scanner.next();

        System.out.println("Enter the word to replace it with:");
        String replaceWord = scanner.next();

        int startIndex = sentence.indexOf(searchWord);

        if (startIndex != -1) {
            String modifiedSentence = sentence.substring(0, startIndex) + replaceWord + sentence.substring(startIndex + searchWord.length());

            System.out.println("\nOriginal sentence: " + sentence);
            System.out.println("Modified sentence: " + modifiedSentence);
        } else {
            System.out.println("The search word was not found in the sentence.");
        }

        scanner.close();
    }
}

/**
 * OUTPUT
 *
 * Enter a sentence:
 * Except a Sentence, I am writing a Quote -> Love is like the wind, you can’t see it but you can feel it.
 * Enter the word to search for:
 * wind
 * Enter the word to replace it with:
 * breeze
 *
 * Original sentence: Except a Sentence, I am writing a Quote -> Love is like the wind, you can’t see it but you can feel it.
 * Modified sentence: Except a Sentence, I am writing a Quote -> Love is like the breeze, you can’t see it but you can feel it.
 */