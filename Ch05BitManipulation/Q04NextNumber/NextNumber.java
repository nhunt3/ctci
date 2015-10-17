package Ch05BitManipulation.Q04NextNumber;

/**
 * Created by nick on 10/17/2015.
 */
public class NextNumber
{
    public static void main(String[] args)
    {
        int testNumber = 30618;
        GetNextNumber(testNumber);
        //System.out.println(GetNextNumber(testNumber));
    }

    public static int GetNextNumber(int number)
    {
        for (int i = 0; i < 15; i++)
        {
            System.out.println(getBit(number, i));
        }

        return 12345;
    }

    public static boolean getBit(int num, int i)
    {
        return ((num & (1 << i)) != 0);
    }
}
