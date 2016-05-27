package Ch10SortingAndSearching.Q02GroupAnagrams;

import java.util.Arrays;

/**
 * Created by nick on 1/24/2016.
 */

// This code doesn't work...
public class Q02GroupAnagrams
{
    public static void main(String[] args)
    {
        String[] orig = {"dog", "cat", "tan", "tool", "cod", "act", "ant", "loot", "god", "loto"};
        String[] copy = orig.clone();

        String[] sorted2 = GroupAnagrams(orig, copy);

        for (int i = 0; i < sorted2.length; i++)
        {
            System.out.println(sorted2[i]);
        }
    }

    public static String[] GroupAnagrams(String[] orig, String[] copy)
    {
        String[] sorted = new String[orig.length];

        for (int i = 0; i < sorted.length; i++)
        {
            char[] copyChar = copy[i].toCharArray();
            Arrays.sort(copyChar);
            String b = new String(copyChar);
            sorted[i] = b;
        }


//        String[] newSorted = new String[orig.length];
//        String[] newOrig = new String[orig.length];
//
//        for (int i = 0; i < newSorted.length; i++)
//        {
//
//        }

        //Arrays.sort(sorted);

        return sorted;
    }
}
