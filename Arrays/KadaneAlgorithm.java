public class KadaneAlgorithm {
    public static int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubarraySum(numbers);

        System.out.println("Maximum subarray sum: " + result);
    }
}
