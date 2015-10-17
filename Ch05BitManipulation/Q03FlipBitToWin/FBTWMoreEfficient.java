package Ch05BitManipulation.Q03FlipBitToWin;

/**
 * Created by nick on 10/10/2015.
 */
public class FBTWMoreEfficient
{
    public static void main(String[] args) {
        System.out.println(FlipBitToWin(111534));
    }

    public static int FlipBitToWin(int number) {
        int count = 0;
        int max = 0;
        int prevCount = 0;
        final int bits = 32;

        for (int i = 0; i < bits; i++) {
            boolean bitVal = getBit(number, i);
            if (!bitVal) {
                max = Math.max(max, prevCount + count + 1);
                prevCount = count;
                count = 0;
            }
            else {
                count++;
            }
        }

        // Edge case: Leftmost binary digit is a one
        max = Math.max(max, prevCount + count + 1);

        // Edge case: all bits are 1s
        if (count == bits) {
            max = count;
        }

        return max;
    }

    public static boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }
}
