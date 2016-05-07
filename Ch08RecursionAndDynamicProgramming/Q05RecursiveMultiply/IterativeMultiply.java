package Ch08RecursionAndDynamicProgramming.Q05RecursiveMultiply;

/**
 * Created by nick on 12/6/2015.
 */
public class IterativeMultiply
{
    public static void main(String[] args)
    {
        int result = IterMult(10, 5);
        System.out.println(result);
    }

    public static int IterMult(int x, int y)
    {
        int result = 0;

        for (int i = 0; i < y; i++)
        {
            result += x;
        }

        return result;
    }
}
