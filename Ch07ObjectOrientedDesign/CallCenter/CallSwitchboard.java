package Ch07ObjectOrientedDesign.CallCenter;

/**
 * Created by nick on 11/2/2015.
 */
public class CallSwitchboard
{
    public static void main(String[] args)
    {

    }

    public Employee DispatchCall(Employee[] empArr)
    {
        for (int i = 0; i < empArr.length; i++)
        {
            if (empArr[i].isAvailable)
            {
                return empArr[i];
            }
        }

        // Add Call to queue

        // placeholder code...
        return empArr[0];
    }


}
