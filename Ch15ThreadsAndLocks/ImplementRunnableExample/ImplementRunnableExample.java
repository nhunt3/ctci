package Ch15ThreadsAndLocks.ImplementRunnableExample;

/**
 * Created by nick on 12/19/2015.
 */
public class ImplementRunnableExample
{
    public static void main(String[] args) {
        RunnableThread instance = new RunnableThread();
        Thread thread = new Thread(instance);
        thread.start();

		/* waits until earlier thread counts to 5 (slowly) */
        while (instance.count != 5)
        {
            try
            {
                Thread.sleep(250);
                System.out.println("Doing stuff");
            }
            catch (InterruptedException exc)
            {
                exc.printStackTrace();
            }
        }

        System.out.println("Program Terminating.");
    }
}
