public class Q02 {
    public static void main(String[] args) {
        String input = "aeiouh6";
        try {
            displayNumericCharacters(input);
        } catch(NullPointerException e) {
            System.err.println("Error : Input string is null!");
        } catch(Exception e) {
            System.err.println("Error occurred: "+e.getMessage());
        }
    }

    public static void displayNumericCharacters(String input) {
        if(input == null || input.isEmpty()) {
            throw new NullPointerException("Input String is Null or Empty!");
        }
        boolean found = false;
        for(int i = 2; i < input.length(); i++) {
            char currChar = input.charAt(i);
            char prevChar = input.charAt(i-1);
            char prevPrevChar = input.charAt(i-2);
            if (Character.isDigit(currChar)) {
                if (isVowel(prevPrevChar) && !isVowel(prevChar)) {
                    System.out.println("Numeric Character : "+currChar);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No numeric characters preceded by a vowel and consonant found!");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

/**
 * OUTPUT
 * Numeric Character : 6
 */