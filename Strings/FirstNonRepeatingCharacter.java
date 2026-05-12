public class FirstNonRepeatingCharacter {
    public static char firstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeating(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
