public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int index = 0;

        // Move all non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill the remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};

        System.out.print("Original Array: ");
        printArray(numbers);

        moveZeros(numbers);

        System.out.print("After Moving Zeros: ");
        printArray(numbers);
    }
}
