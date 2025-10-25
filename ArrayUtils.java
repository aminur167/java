import java.util.Arrays;

/**
 * Array utility methods
 * - find max/min
 * - calculate average
 * - sort array
 * - linear search
 */
public class ArrayUtils {
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return (double) sum / arr.length;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 56, 23, 89, 67};

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.printf("Average: %.2f%n", average(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        int idx = linearSearch(numbers, 56);
        System.out.println("56 found at index: " + idx);
    }
}
