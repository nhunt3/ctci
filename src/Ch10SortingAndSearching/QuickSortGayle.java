package Ch10SortingAndSearching;

/**
 * Created by nick on 1/10/2016.
 */
public class QuickSortGayle {
    public static void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[(left + right) / 2]; // Pick a pivot point. Can be an element

        while (left <= right) { // Until we've gone through the whole array
            // Find element on left that should be on right
            while (arr[left] < pivot) {
                left++;
            }

            // Find element on right that should be on left
            while (arr[right] > pivot) {
                right--;
            }

            // Swap elements, and move left and right indices
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        printIntArray(arr);
        return left;
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        int index = partition(arr, left, right);
        if (left < index - 1) { // Sort left half
            quickSort(arr, left, index - 1);
        }
        if (index < right) { // Sort right half
            quickSort(arr, index, right);
        }
    }

    public static void printIntArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        int[] arr = {6,5,1,3,8,4,7,9};
        printIntArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printIntArray(arr);
    }
}
