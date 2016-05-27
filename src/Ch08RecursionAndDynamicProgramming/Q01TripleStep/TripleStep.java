package Ch08RecursionAndDynamicProgramming.Q01TripleStep;

/**
 * Created by nick on 11/8/2015.
 */
public class TripleStep
{
    public static void main(String[] args)
    {
        System.out.println(TripStepMemo(36));
    }

    public static long TripStepMemo(long n)
    {
        if (n >= 0 && n <= 2)
        {
            return n;
        }
        else if (n == 3)
        {
            return 4;
        }

        return TripStepMemo(n-1) + TripStepMemo(n-2) + TripStepMemo(n-3);
    }
}
