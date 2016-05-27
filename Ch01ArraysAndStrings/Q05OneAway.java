package Ch01ArraysAndStrings;

/**
 * Created by nick on 7/21/2015.
 */
public class Q05OneAway
{
    boolean CheckOneAway(String word, String close)
    {
        if (Math.abs(word.length() - close.length()) > 1)
        {
            return false;
        }

        int offBy = 0;
        int j = 0;

        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) != close.charAt(j))
            {
                if (word.charAt(i + 1) == close.charAt(j + 1)) // insert
                {
                    offBy++;
                }
                else if (word.charAt(i) == close.charAt(j + 1)) // replace
                {
                    offBy++;
                    i--;
                }
                else if (word.charAt(i + 1) == close.charAt(j)) // remove
                {
                    offBy++;
                    i++;
                }
            }
            j++;

            if(offBy > 1)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Ch01ArraysAndStrings.Q05OneAway oA = new Ch01ArraysAndStrings.Q05OneAway();
        boolean isOneAway = oA.CheckOneAway("pale", "palk");
        System.out.println(isOneAway);
    }
}
