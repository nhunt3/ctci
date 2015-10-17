package Ch05BitManipulation.Q02BinaryToString;

/**
 * Created by nick on 10/4/2015.
 */
public class BinaryToString
{
    public static void main(String[] args)
    {
        System.out.println(Base10ToOtherBase(.625, 2));
    }

    public static String Base10ToOtherBase(double number, int base)
    {
        StringBuilder FinalString = new StringBuilder();
        FinalString.append(".");

        for (int i = 1; i <= 32; i++)
        {
            String[] myNum = Double.toString(number * base).split("\\.");
            FinalString.append(myNum[0]);

            if (Integer.parseInt(myNum[1]) == 0)
            {
                return FinalString.toString();
            }
            else
            {
                number = Double.parseDouble("." + myNum[1]);
            }
        }

        return FinalString.toString();
    }
}
