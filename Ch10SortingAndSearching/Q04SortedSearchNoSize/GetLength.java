package Ch10SortingAndSearching.Q04SortedSearchNoSize;

/**
 * Created by nick on 3/25/2016.
 */
public class GetLength
{
    public static void main(String[] args)
    {
        System.out.println("");
        int[] array = {1, 2};
        Listy list = new Listy(array);
        System.out.println(GetLength(list, 0, 1));
        //System.out.println(FindValue(list, 15));
    }

    public static int GetLength(Listy list, int arrInd, int expBackIndex)
    {
        if (list.elementAt(0) == -1)
        {
            return 0;
        }
        else if (list.elementAt(1) == -1)
        {
            return 1;
        }

        if (list.elementAt(arrInd + expBackIndex) != -1 && list.elementAt(arrInd + expBackIndex + 1) == -1)
        {
            return arrInd + expBackIndex + 1;
        }

        if (list.elementAt(arrInd + expBackIndex) != -1)
        {
            return GetLength(list, arrInd, expBackIndex*2);
        }
        else
        {
            return GetLength(list, arrInd + (expBackIndex/2), 1);
        }
    }
}
