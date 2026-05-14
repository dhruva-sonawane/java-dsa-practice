public class GenerateSubsets {
    public static void generate(String input, String current, int index) {
        if (index == input.length()) {
            System.out.println(current);
            return;
        }
        generate(input, current, index + 1);
        generate(input, current + input.charAt(index), index + 1);
    }
}
