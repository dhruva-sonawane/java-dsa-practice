public class CharacterFrequency {
    public static int countCharacter(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "programming";
        char target = 'g';

        System.out.println("Frequency of '" + target + "': " +
                           countCharacter(input, target));
    }
}
