package Ch10SortingAndSearching;

/**
 * Created by nick on 1/19/2016.
 */
public class SortedMergeGayle
{
    /** Merges array
     * @param a first array
     * @param b second array
     * @param lastA number of "real" elements in a
     * @param lastB number of "real" elements in b
     */
    public static void merge(int[] a, int[] b, int lastA, int lastB)
    {
        int indexMerged = lastB + lastA - 1; /* Index of last location of merged array */
        int indexA = lastA - 1; /* Index of last element in array b */
        int indexB = lastB - 1; /* Index of last element in array a */

    /* Merge a and b, starting from the last element in each */
        while (indexB >= 0)
        {
            if (indexA >= 0 && a[indexA] > b[indexB]) /* end of a is bigger than end of b */
            {
                a[indexMerged] = a[indexA]; // copy element
                indexA--;
            } else
            {
                a[indexMerged] = b[indexB]; // copy element
                indexB--;
            }

            indexMerged--; // move indices
        }
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
        int[] b = {3, 4, 6, 7, 7, 7};
        merge(a, b, 8, 6);

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

}
