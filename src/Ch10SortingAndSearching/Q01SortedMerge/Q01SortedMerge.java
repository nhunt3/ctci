package Ch10SortingAndSearching;

/**
 * Created by nick on 1/19/2016.
 */
public class Q01SortedMerge
{
    public static void main(String[] args)
    {
        int[] A = {2, 5, 8, 10, 20, 0, 0, 0, 0, 0, 0};
        int[] B = {1, 3, 6, 9, 11, 25};

        int[] finalA = SortedMerge(A, B);

        for (int i = 0; i < A.length; i++)
        {
            System.out.println(finalA[i]);
        }
    }

    public static int[] SortedMerge(int[] A, int[] B)
    {
        int Astart = A.length - 1;
        for (int i = A.length - 1; i >= 0; i--)
        {
            if (A[i] != 0)
            {
                Astart = i;
                break;
            }
        }

        int a = Astart;
        int b = B.length - 1;
        int finalA = A.length - 1;

        while (b >= 0)
        {
            if (a >= 0 && A[a] > B[b])
            {
                A[finalA] = A[a];
                a--;
            }
            else
            {
                A[finalA] = B[b];
                b--;
            }

            finalA--;
        }

        return A;
    }
}
