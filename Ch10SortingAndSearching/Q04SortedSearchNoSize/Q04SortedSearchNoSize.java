package Ch10SortingAndSearching.Q04SortedSearchNoSize;


/**
 * Created by nick on 3/23/2016.
 */
public class Q04SortedSearchNoSize
{
    public static void main(String[] args)
    {
        System.out.println("");
        int[] array = {1, 2, 3, 4, 15, 16, 17, 18, 19, 20};
        Listy list = new Listy(array);
        System.out.println(FindValue(list, 20));
    }

    public static int FindValue(Listy list, int toFind)
    {
        int index = 1;

        while(list.elementAt(index) != -1 && list.elementAt(index) < toFind)
        {
            index*=2;
        }

        return RecursiveBinarySearch(list, toFind, index/2, index);
    }

    public static int RecursiveBinarySearch(Listy list, int toFind, int low, int high)
    {
        if (low > high)
        {
            return -1;
        }

        int iMid = low + ((high-low)/2);
        int vMid = list.elementAt(iMid);

        if (vMid > toFind || vMid == -1)
        {
            return RecursiveBinarySearch(list, toFind, low, iMid - 1);
        }
        else if(vMid < toFind)
        {
            return RecursiveBinarySearch(list, toFind, iMid + 1, high);
        }
        else // if (vMid == toFind)
        {
            return iMid;
        }
    }
}
