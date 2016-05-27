package Ch08RecursionAndDynamicProgramming.Q06TowersOfHanoi;

/**
 * Created by nick on 3/27/2016.
 */
public class Q06TowersOfHanoi
{
    public static void main(String[] args)
    {
        Tower t1 = new Tower(1);
        Tower t2 = new Tower(2);
        Tower t3 = new Tower(3);

        for (int i = 3; i >= 1; i--)
        {
            t1.add(i);
        }

        //t1.print();

        t1.moveDisks(3, t3, t2);
    }
}
