package BitManipulation.FlipBitToWin;

import java.util.ArrayList;

/**
 * Created by nick on 10/10/2015.
 */
public class FlipBitToWin
{
    public static void main(String[] args)
    {
        System.out.println(FlipBitToWin(490335));
    }

    public static int FlipBitToWin(int number)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < 32; i++)
        {
            boolean bitVal = getBit(number, i);
            if (!bitVal)
            {
                arr.add(count);
                count = 0;
            }
            else
            {
                count++;
            }
        }

        int max = 0;
        for (int i = 1; i < arr.size(); i++)
        {
            max = Math.max(max, arr.get(i-1) + arr.get(i));
        }

        return max;
    }

    public static boolean getBit(int num, int i)
    {
        return ((num & (1 << i)) != 0);
    }
}
