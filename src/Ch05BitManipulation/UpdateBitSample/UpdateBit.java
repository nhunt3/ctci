package BitManipulation.UpdateBitSample;

/**
 * Created by nick on 10/4/2015.
 */
public class UpdateBit
{
    public static void main(String[] args)
    {
        int ret = UpdateBit(1813, 4, true);
        System.out.println(ret);
    }

    public static int UpdateBit(int num, int i, boolean bitIs1)
    {
        int value = bitIs1 ? 1 : 0;
        int mask = ~(1 << i);
//        System.out.println(Integer.toBinaryString(num));
//        System.out.println(Integer.toBinaryString(mask));
//        System.out.println(Integer.toBinaryString(num & mask));
//        System.out.println(Integer.toBinaryString(value));
//        System.out.println(Integer.toBinaryString(value << i));
//        System.out.println(Integer.toBinaryString((num & mask) | (value << i)));
        return (num & mask) | (value << i);
    }
}
