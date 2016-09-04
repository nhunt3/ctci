package Ch10SortingAndSearching;

/**
 * Created by nick on 3/16/2016.
 */
public class Q03SearchInRotatedArray
{
    public static void main(String[] args)
    {
        //int toFind = 18;
        //int[] nums = {15, 16, 17, 18, 19, 20, 21, 22, 4, 5, 6};
        //int toFind = 1;
        //int[] nums = {20, 21, 1, 2, 3, 4, 5, 6, 7};
        int toFind = 3;
        int[] nums = {2, 2, 2, 2, 2, 3, 1, 2, 2, 2};
        System.out.println(FindNum(toFind, 0, nums.length - 1, nums));
    }

    public static int FindNum(int toFind, int iFirst, int iLast, int[] nums)
    {
        int iMid = iFirst + (iLast - iFirst) / 2;
        int vMid = nums[iMid];
        int vFirst = nums[iFirst];
        int vLast = nums[iLast];
        int returnValue = -1;

        if (toFind == vMid)
        {
            return iMid;
        }

        if (iFirst >= iLast)
        {
            return -1;
        }

        if (vFirst < vMid && (toFind >= vFirst && toFind < vMid))
        {
            returnValue = FindNum(toFind, iFirst, iMid - 1, nums);
        }
        else if (vMid < vLast && (toFind >= vMid && toFind < vLast))
        {
            returnValue = FindNum(toFind, iMid + 1, iLast, nums);
        }
        else if (vFirst > vMid)
        {
            returnValue = FindNum(toFind, iFirst, iMid - 1, nums);
        }
        else if (vMid > vLast)
        {
            returnValue = FindNum(toFind, iMid + 1, iLast, nums);
        }
        else if (vFirst == vMid)
        {
            if (vMid != vLast)
            {
                returnValue = FindNum(toFind, iMid + 1, iLast, nums);
            }
            else
            {
                int result = FindNum(toFind, iFirst, iMid - 1, nums);
                if (result == -1) {
                    returnValue = FindNum(toFind, iMid + 1, iLast, nums);
                } else {
                    returnValue = result;
                }
            }
        }

        return returnValue;
    }
}
