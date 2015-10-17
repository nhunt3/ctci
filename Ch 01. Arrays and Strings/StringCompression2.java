/**
 * Created by nhunt on 7/29/2015.
 */
public class StringCompression2
{
    public String compress(String bS)
    {
        Character prev = ' ';
        Character curr = ' ';
        Integer count = 0;
        String compressed = "";

        for (int i = 0; i < bS.length(); i++)
        {
            curr = bS.charAt(i);
            count ++;

            if (prev != curr && i > 0)
            {
                compressed += prev + count.toString();
                count = 0;
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
        StringCompression2 sC = new StringCompression2();
        String compressed = sC.compress("aabcccccaaa");
        System.out.println(compressed);
    }
}
