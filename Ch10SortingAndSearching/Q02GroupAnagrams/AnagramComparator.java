package Ch10SortingAndSearching.Q02GroupAnagrams;

/**
 * Created by nick on 1/24/2016.
 */
import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {
    public String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public int compare(String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }
}
