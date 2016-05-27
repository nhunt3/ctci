package Ch08RecursionAndDynamicProgramming.Q03Magicindex;

/**
 * Created by nick on 11/25/2015.
 */
public class MagicIndexWithDups
{
    private static int[] A = new int[11];
    private static StringBuilder message = new StringBuilder();

    public static void main(String[] args)
    {
        A[0] = -10;
        A[1] = -5;
        A[2] = 1;
        A[3] = 2;
        A[4] = 2;
        A[5] = 3;
        A[6] = 4;
        A[7] = 7;
        A[8] = 9;
        A[9] = 12;
        A[10]= 13;

        int index = FindMagicIndex(0, A.length-1);
        System.out.println(message.toString());
        System.out.println(index);
    }

    public static int FindMagicIndex(int min, int max)
    {
        if (max - min < 0)
        {
            //message.append("Doesn't Exist!");
            return -1;
        }

        int i = (min + max) / 2;

        if (A[i] == i)
        {
            // Found One!
            message.append("Found One at A[" + i + "]!!");
            return i;
        }
        else if (A[i] < i)
        {
            int left = FindMagicIndex(min, A[i]);
            if (left >=0)
            {
                return left;
            }

            int right = FindMagicIndex(i+1, max);
            return right;
        }
        else if (A[i] > i)
        {
            int left = FindMagicIndex(min, i-1);
            if (left >=0)
            {
                return left;
            }

            int right = FindMagicIndex(A[i], max);
            return right;
        }
        else
        {
            return -999;
        }
    }
}
