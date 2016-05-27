package Ch08RecursionAndDynamicProgramming.Q05RecursiveMultiply;

/**
 * Created by nick on 12/6/2015.
 */
public class RecursiveMultiply
{
    public static void main(String[] args)
    {
        int x = 13494;
        int y = 22323;
        int smaller = Math.min(x, y);
        int larger = Math.max(x, y);
        int result = RecMult(larger, smaller);
        System.out.println(result);
    }

    public static int RecMult(int x, int y)
    {
        if (y == 0)
        {
            return 0;
        }

        return RecMult(x, y-1) + x;
    }
}
