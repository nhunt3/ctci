package Ch08RecursionAndDynamicProgramming.Q07PermutationsWithoutDups;
import java.util.ArrayList;

/**
 * Created by nick on 3/30/2016.
 */
public class Q07PermutationsWithoutDupsIterative
{
    public static void main(String[] args)
    {
        ArrayList<String> list = FindPerms("abc");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<String> FindPerms(String word)
    {
        ArrayList<ArrayList<String>> ListOfListOfPerms = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < word.length(); i++)
        {
            if (ListOfListOfPerms.size() > 0)
            {
                ArrayList<String> subList = new ArrayList<String>();

                for (int j = 0; j < ListOfListOfPerms.get(i-1).size(); j++)
                {
                    for (int k = 0; k <= ListOfListOfPerms.get(i - 1).get(j).length(); k++)
                    {
                        if (k == ListOfListOfPerms.get(i - 1).get(j).length())
                        {
                            subList.add(ListOfListOfPerms.get(i - 1).get(j) + word.charAt(i));
                        }
                        else
                        {
                            subList.add(ListOfListOfPerms.get(i - 1).get(j).substring(0,k) + word.charAt(i) + ListOfListOfPerms.get(i - 1).get(j).substring(k, ListOfListOfPerms.get(i - 1).get(j).length()));
                        }
                    }
                }

                ListOfListOfPerms.add(subList);
            }
            else
            {
                ArrayList<String> subList = new ArrayList<String>();
                subList.add(Character.toString(word.charAt(0)));
                ListOfListOfPerms.add(subList);
            }
        }

        return ListOfListOfPerms.get(ListOfListOfPerms.size() - 1);
    }
}
