package Ch07ObjectOrientedDesign.CallCenter;

/**
 * Created by nick on 11/2/2015.
 */
public abstract class Employee
{
    public boolean isAvailable;
    public String position;

    public Employee EscalateCall(Employee me)
    {
        if (me.position == "Respondant")
        {
            // Loop through mamagers and return 1st available one

            // if no one available, then loop through directors and return 1st available one

            // if no one is available the add to the queue
        }

        if (me.position == "Manager")
        {
            // Loop through directors and return 1st available one

            // if no one is available the add to the queue
        }

        // Placeholder code
        return me;
    }
}
