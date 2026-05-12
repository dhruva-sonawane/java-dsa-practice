public class RemoveSpaces {
    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    public static void main(String[] args) {
        String input = "Hello World Java";
        System.out.println("Without spaces: " + removeSpaces(input));
    }
}
