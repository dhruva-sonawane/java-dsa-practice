public class StringCompression {
    public static String compress(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbcc";
        System.out.println("Compressed string: " + compress(input));
    }
}
