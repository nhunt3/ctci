package Ch10SortingAndSearching.Q04SortedSearchNoSize;

/**
 * Created by nick on 3/23/2016.
 */
public class Listy {
    int[] array;

    public Listy(int[] arr) {
        array = arr.clone();
    }

    public int elementAt(int index) {
        if (index >= array.length) {
            return -1;
        }
        return array[index];
    }
}
