package Ch01ArraysAndStrings;

/**
 * Created by nick on 7/19/2015.
 */
public class Q04PalindromePermutation
{
    boolean PalPerm(String pal)
    {
        int[] charCounts = new int[256];
        char currChar;

        for (int i = 0; i < pal.length(); i++)
        {
            currChar = pal.charAt(i);
            charCounts[(int) currChar] += 1;
        }

        int oddCount = 0;

        for (int i = 97; i <= 122; i++)
        {
            if (charCounts[i] % 2 != 0)
            {
                oddCount += 1;
            }

            if (oddCount > 1)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Ch01ArraysAndStrings.Q04PalindromePermutation pp = new Ch01ArraysAndStrings.Q04PalindromePermutation();
        boolean isPalindrome = pp.PalPerm("ecarrca");
        System.out.println(isPalindrome);
    }
}
