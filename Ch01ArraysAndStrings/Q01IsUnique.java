package Ch01ArraysAndStrings;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nick on 7/13/2015.
 */
public class Q01IsUnique
{
    public static void main(String[] args)
    {
        String isUnique = "adfergesgghrww";

//        // Using HashMap
//        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
//        Character currChar;
//
//        for (int i = 0; i < isUnique.length(); i++)
//        {
//            currChar = isUnique.charAt(i);
//            int count = myMap.containsKey(currChar) ? myMap.get(currChar) : 0;
//
//            if (count + 1 > 1)
//            {
//                System.out.println(i);
//                break;
//            }
//
//            myMap.put(currChar, count + 1);
//        }

        // Using int[]
        int[] intArr = new int[256];
        int newCount;

        for (int i = 0; i < isUnique.length(); i++)
        {
            if (intArr[(int) isUnique.charAt(i)] + 1 > 1)
            {
                System.out.println(i);
                break;
            }

            intArr[(int) isUnique.charAt(i)] = intArr[(int) isUnique.charAt(i)] + 1;
        }

        // Her solution: bit shifting...

    }
}
