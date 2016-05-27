package Ch10SortingAndSearching;

/**
 * Created by nick on 1/11/2016.
 */

// Note: This code doesn't work yet
public class RealQuickSort
{
    public static void main(String[] args)
    {
        int[] arr = {6,5,1,3,8,4,7,9};
        printIntArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printIntArray(arr);
    }

    public static void printIntArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void quickSort(int[] A, int low, int high)
    {
        if (low < high)
        {
            int pivot_location = Partition(A, low, high);
            quickSort(A, low, pivot_location);
            quickSort(A, pivot_location + 1, high);
        }
    }

    public static int Partition(int[] A, int low, int high)
    {
        int pivot = A[low];
        int leftwall = low;

        for (int i = low + 1; i < high; i++)
        {
            if (A[i] < pivot)
            {
                swap(A, i, leftwall);
                leftwall = leftwall + 1;
            }
        }
        swap(A, low, leftwall);

        return leftwall;
    }

    public static void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
