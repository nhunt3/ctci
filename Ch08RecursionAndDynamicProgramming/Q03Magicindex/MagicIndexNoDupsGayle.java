package Ch08RecursionAndDynamicProgramming.Q03Magicindex;

/**
 * Created by nick on 11/26/2015.
 */
public class MagicIndexNoDupsGayle
{
    private static int[] array = new int[11];

    public static void main(String[] args)
    {
        array[0] = -10;
        array[1] = -5;
        array[2] = 1;
        array[3] = 2;
        array[4] = 2;
        array[5] = 3;
        array[6] = 4;
        array[7] = 7;
        array[8] = 9;
        array[9] = 12;
        array[10]= 13;

        System.out.println(magicFast(0, array.length-1));
    }

    public static int magicFast(int start, int end)
    {
        if (end < start)
        {
            return -1;
        }

        int midIndex = (start + end) / 2;
        int midValue = array[midIndex];
        if (midValue == midIndex)
        {
            return midIndex;
        }
		/* Search left */
        int leftIndex = Math.min(midIndex - 1, midValue);
        int left = magicFast(start, leftIndex);
        if (left >= 0)
        {
            return left;
        }

		/* Search right */
        int rightIndex = Math.max(midIndex + 1, midValue);
        int right = magicFast(rightIndex, end);

        return right;
    }
}
