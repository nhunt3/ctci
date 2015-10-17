package ArraysAndStrings;

/**
 * Created by nick on 7/16/2015.
 */
public class URLify
{
    public static void main(String[] args)
    {
        String str = "Mr John Smith    ";
        System.out.println(str);
        Character currChar;
        String temp;

        for (int i = 0; i < str.length(); i++)
        {
            currChar = str.charAt(i);

            if (currChar == ' ')
            {
                temp = str.substring(i + 1);
                str = str.substring(0, i);
                str += "%20";
                str += temp;
            }
        }

        System.out.println(str);
    }
}
