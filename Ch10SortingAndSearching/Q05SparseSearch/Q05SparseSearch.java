package Ch10SortingAndSearching.Q05SparseSearch;

/**
 * Created by nick on 3/26/2016.
 */
public class Q05SparseSearch
{
    public static void main(String[] args)
    {
        String toFind = "foo";
        String[] strings = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        //String[] strings = {"apple", "banana", "carrot", "dad", "elephant", "", "", "", "", "juke", "kangaroo", "lemon"};
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
        boolean tempadd = false;

        while(strings[tempMid] == "")
        {
            if (tempMid == low)
            {
                if(tempMid >= strings.length - 1)
                {
                    return -1;
                }

                tempadd = true;
                tempMid = iMid + 1;
            }
            else if (tempadd == true)
            {
                if(tempMid >= strings.length - 1)
                {
                    return -1;
                }

                tempMid++;
            }
            else
            {
                tempMid--;
            }
        }

        tempadd = false;

        if(strings[tempMid].compareTo(toFind) < 0) // if toFind > strings[iMid]
        {
            return FindString(toFind, Math.max(tempMid, iMid + 1), high, strings);
        }
        else if(strings[tempMid].compareTo(toFind) > 0) // if toFind < strings[iMid]
        {
            return FindString(toFind, low, Math.min(tempMid, iMid - 1), strings);
        }
        else // if strings[iMid] == toFind
        {
            return tempMid;
        }
    }
}
