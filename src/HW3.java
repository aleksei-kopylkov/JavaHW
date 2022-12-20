import java.util.Arrays;
import java.util.Random;
public class HW3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int [10];

        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before:");
        System.out.println(Arrays.toString(numbers));

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("After:");
        System.out.println(Arrays.toString(numbers));
    }

    public static void quicksort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = arr[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && rightPointer > leftPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);
        quicksort(arr, lowIndex, leftPointer - 1);
        quicksort(arr, leftPointer + 1, highIndex);
    }
    private static void swap(int[] arr, int index1, int index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }
}