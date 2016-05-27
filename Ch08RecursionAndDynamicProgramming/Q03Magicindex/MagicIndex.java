package Ch08RecursionAndDynamicProgramming.Q03Magicindex;

/**
 * Created by nick on 11/22/2015.
 */
public class MagicIndex
{
    private static int[] A = new int[8];
    private static StringBuilder message = new StringBuilder();

    public static void main(String[] args)
    {
        A[0] = -1;
        A[1] = 0;
        A[2] = 1;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;

        FindMagicIndex(0, A.length-1);
        System.out.println(message.toString());
    }

    public static void FindMagicIndex(int min, int max)
    {
        if (max - min == 0)
        {
            message.append("Doesn't Exist!");
            return;
        }

        int i = min + ((max-min)/2);

        if (A[i] == i)
        {
            // Found One!
            message.append("Found One at A[" + i + "]!!");
            return;
        }
        else if (A[i] > i)
        {
            FindMagicIndex(min, i);
        }
        else if (A[i] < i)
        {
            FindMagicIndex(i+1, max);
        }

        return;
    }
}
