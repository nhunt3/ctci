package Ch15ThreadsAndLocks.ExtendThreadExample;

/**
 * Created by nick on 12/19/2015.
 */
public class ExtendThread extends Thread
{
    int count = 0;

    public void run()
    {
        System.out.println("Thread starting.");
        try
        {
            while (count < 5)
            {
                Thread.sleep(500);
                System.out.println("In Thread, count is " + count);
                count++;
            }
        }
        catch (InterruptedException exc)
        {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Thread terminating.");
    }
}
