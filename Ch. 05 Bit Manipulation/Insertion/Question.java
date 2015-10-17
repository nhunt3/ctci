package BitManipulation.Insertion;

/**
 * Created by nick on 10/4/2015.
 */
public class Question
{
    public static void main(String[] args)
    {
        int N = Insert(6776, 19, 2, 6);
        System.out.println(Integer.toBinaryString(N));
    }

    public static int Insert(int N, int M, int i, int j)
    {
        int clearedN = ClearN(N, M, i, j);
        //System.out.println(Integer.toBinaryString(clearedN));
        return clearedN | (M << i);
    }

    public static int ClearN(int N, int M, int i, int j)
    {
        int mask = ~(~(~0 << (j-i+1))<< i);
        //System.out.println(Integer.toBinaryString(N));
        //System.out.println(Integer.toBinaryString(mask));
        //System.out.println(Integer.toBinaryString(N & mask));
        return N & mask;
    }
}
