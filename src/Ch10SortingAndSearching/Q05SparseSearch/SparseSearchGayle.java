package Ch10SortingAndSearching.Q05SparseSearch;

/**
 * Created by nick on 3/26/2016.
 */
public class SparseSearchGayle
{
    public static int search(String[] strings, String str, int first, int last) {
        if (first > last) {
            return -1;
        }

		/* Move mid to the middle */
        int mid = (last + first) / 2;

		/* If mid is empty, find closest non-empty string. */
        if (strings[mid].isEmpty()) {
            int left = mid - 1;
            int right = mid + 1;
            while (true) {
                if (left < first && right > last) {
                    return -1;
                } else if (right <= last && !strings[right].isEmpty()) {
                    mid = right;
                    break;
                } else if (left >= first && !strings[left].isEmpty()) {
                    mid = left;
                    break;
                }
                right++;
                left--;
            }
        }

		/* Check for string, and recurse if necessary */
        if (str.equals(strings[mid])) { // Found it!
            return mid;
        } else if (strings[mid].compareTo(str) < 0) { // Search right
            return search(strings, str, mid + 1, last);
        } else { // Search left
            return search(strings, str, first, mid - 1);
        }
    }

    public static int search(String[] strings, String str) {
        if (strings == null || str == null || str.isEmpty()) {
            return -1;
        }
        return search(strings, str, 0, strings.length - 1);
    }

    public static void main(String[] args) {
        //String[] stringList = {"apple", "", "", "banana", "", "", "", "carrot", "duck", "", "", "eel", "", "flower", "", ""};
        String[] stringList = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        System.out.println(search(stringList, "foo"));

        //for (String s : stringList) {
        //	String cloned = new String(s);
        //	System.out.println("<" + cloned + "> " + " appears at location " + search(stringList, cloned));
        //}
    }
}
