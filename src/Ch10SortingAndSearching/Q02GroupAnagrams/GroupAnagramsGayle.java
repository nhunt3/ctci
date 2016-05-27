package Ch10SortingAndSearching.Q02GroupAnagrams;

/**
 * Created by nick on 1/24/2016.
 */
import java.util.Arrays;

public class GroupAnagramsGayle
{
    public static void main(String[] args)
    {
        String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
        System.out.println(stringArrayToString(array));
        Arrays.sort(array, new AnagramComparator());
        System.out.println(stringArrayToString(array));
    }

    public static String stringArrayToString(String[] array)
    {
        StringBuilder sb = new StringBuilder();
        for (String v : array)
        {
            sb.append(v + ", ");
        }
        return sb.toString();
    }
}
