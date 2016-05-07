package Ch05BitManipulation.Q04NextNumber;

/**
 * Created by nick on 10/17/2015.
 */
public class NextNumber
{
    public static void main(String[] args)
    {
        int testNumber = 14;
        //GetNextNumber(testNumber);
        System.out.println(GetNextNumber(testNumber));
    }

    public static int GetNextNumber(int number)
    {
        // Edge case
        if (number == 0)
        {
            return 1;
        }

        int i;
        for (i = 0; i < 15; i++)
        {
            if (getBit(number, i) == true && getBit(number, i+1) == false)
            {
                number = updateBit(number, i, false);
                number = updateBit(number, i + 1, true);
                break;
            }
        }

        int countOf1s = 0;
        for (int j = i; j >= 0; j--)
        {
            if (getBit(number, j) == true)
            {
                countOf1s++;
                number = updateBit(number, j, false);
            }
        }
        for (int k = 0; k < countOf1s; k++)
        {
            number = updateBit(number, k, true);
        }

        return number;
    }

    public static boolean getBit(int num, int i)
    {
        return ((num & (1 << i)) != 0);
    }

    public static int updateBit(int num, int i, boolean bitIs1)
    {
        int value = bitIs1 ? 1 : 0;
        int mask = ~(1 << i);
        return (num & mask) | (value << i);
    }
}
