//package Ch01ArraysAndStrings;

/**
 * Created by nhunt on 7/29/2015.
 */
public class Q06StringCompression
{
    public String compress(String bS)
    {
        Character prev = ' ';
        Character curr = ' ';
        Integer count = 1;
        String compressed = "";

        for (int i = 0; i < bS.length(); i++)
        {
            curr = bS.charAt(i);

            if (i > 0)
            {
                if (prev != curr)
                {
                    compressed += prev + count.toString();
                    count = 1;
                }
                else
                {
                    count ++;
                }
            }

            if (i == bS.length() - 1)
            {
                compressed += prev + count.toString();
            }

            prev = curr;
        }

        return compressed;
    }

    public static void main(String[] args)
    {
        Q06StringCompression sC = new Q06StringCompression();
        String compressed = sC.compress("aabcccccaaa");
        System.out.println(compressed);
    }
}
