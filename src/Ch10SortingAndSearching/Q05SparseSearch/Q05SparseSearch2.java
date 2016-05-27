package Ch10SortingAndSearching.Q05SparseSearch;

/**
 * Created by nick on 3/26/2016.
 */
public class Q05SparseSearch2
{
    public static void main(String[] args)
    {
        String toFind = "dad";
        String[] strings = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        //String[] strings = {"apple", "banana", "carrot", "dad", "elephant", "", "", "", "", "juke", "kangaroo", "lemon"};
        //String[] strings = {"apple", "", "", "banana", "", "", "", "carrot", "duck", "", "", "eel", "", "flower", "", ""};
        //String[] strings = {"apple", "banana", "carrot", "dad", "elephant", "fill", "gg", "hh", "", "juke", "kangaroo", "lemon"};
        System.out.println(FindString(toFind, 0, strings.length - 1, strings));
    }

    public static int FindString(String toFind, int low, int high, String[] strings)
    {
        if (low > high)
        {
            return -1;
        }

        int iMid = (low + high) / 2;
        int tempMid = iMid;

        if (strings[iMid] == "")
        {
            int left = iMid - 1;
            int right = iMid + 1;

            while (true)
            {
                if (left < low && right > high)
                {
                    return -1;
                }
                else if (right <= high && !strings[right].isEmpty())
                {
                    tempMid = right;
                    break;
                }
                else if (left >= low && !strings[left].isEmpty())
                {
                    tempMid = left;
                    break;
                }
                right++;
                left--;
            }
        }

        if(strings[tempMid].compareTo(toFind) < 0) // if toFind > strings[iMid]
        {
            return FindString(toFind, Math.max(tempMid + 1, iMid + 1), high, strings);
        }
        else if(strings[tempMid].compareTo(toFind) > 0) // if toFind < strings[iMid]
        {
            return FindString(toFind, low, Math.min(tempMid - 1, iMid - 1), strings);
        }
        else // if strings[iMid] == toFind
        {
            return tempMid;
        }
    }
}
