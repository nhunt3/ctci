package Ch08RecursionAndDynamicProgramming.Q04PowerSet;

import java.util.LinkedList;

/**
 * Created by nick on 12/5/2015.
 */
public class PowerSetUsingIteration
{
    public static void main(String[] args)
    {
        LinkedList<String> subSets = new LinkedList<String>();
        //String[] set = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"};
        String[] set = {"a", "b", "c", "d"};

        for (int i = 0; i < set.length; i++)
        {
            int size = subSets.size();

            for (int j = 0; j < size; j++)
            {
                subSets.add(subSets.get(j) + set[i]);
            }

            subSets.add(set[i]);
        }

        for (int i = 0; i < subSets.size(); i++)
        {
            System.out.println(subSets.get(i));
        }
    }
}
