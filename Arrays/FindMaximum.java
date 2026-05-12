public class FindMaximum {
    public static int findMaximum(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 99, 43};

        int maximum = findMaximum(numbers);

        System.out.println("Maximum element: " + maximum);
    }
}
