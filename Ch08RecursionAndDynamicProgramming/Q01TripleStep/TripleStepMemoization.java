package Ch08RecursionAndDynamicProgramming.Q01TripleStep;

/**
 * Created by nick on 11/7/2015.
 */
public class TripleStepMemoization
{
    public static void main(String[] args)
    {
        int n = 36;
        long[] memo = new long[n+1];
        System.out.println(TripStepMemo(n, memo));
    }

    public static long TripStepMemo(int n, long[] memo)
    {
        if (n >= 0 && n <= 2)
        {
            return n;
        }
        else if (n == 3)
        {
            return 4;
        }

        if (memo[n] == 0)
        {
            memo[n] = TripStepMemo(n-1, memo) + TripStepMemo(n-2, memo) + TripStepMemo(n-3, memo);
        }

        return memo[n];
    }
}
