package Ch08RecursionAndDynamicProgramming.Q07PermutationsWithoutDups;

import java.util.ArrayList;

/**
 * Created by nick on 4/10/2016.
 */
public class Q07GayleApproach3
{
    public static void getPerms(String prefix, String remainder, ArrayList<String> result) {
        if (remainder.length() == 0) {
            result.add(prefix);
        }
        int len = remainder.length();
        for (int i = 0; i < len; i++) {
            String before = remainder.substring(0, i);
            String after = remainder.substring(i + 1, len);
            char c = remainder.charAt(i);
            getPerms(prefix + c, before + after, result);
        }
    }

    public static ArrayList<String> getPerms(String str) {
        ArrayList<String> result = new ArrayList<String>();
        getPerms("", str, result);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = getPerms("abc");
        System.out.println("There are " + list.size() + " permutations.");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
