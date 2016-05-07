package Ch15ThreadsAndLocks.ExtendThreadExample;

/**
 * Created by nick on 12/19/2015.
 */
public class ExtendThreadExample
{
    public static void main(String args[]) {
        ExtendThread instance = new ExtendThread();
        instance.start();

        while (instance.count != 5)
        {
            try
            {
                Thread.sleep(250);
                System.out.println("Doing stuff.");
            }
            catch (InterruptedException exc)
            {
                exc.printStackTrace();
            }
        }

        System.out.println("Program Terminating.");
    }
}
