package StacksAndQueues;

/**
 * Created by nick on 8/31/2015.
 */
public class SetOfStacksTestingClass
{
    public static void main(String[] args)
    {
        SetOfStacks sOs = new SetOfStacks(3);
        sOs.push(1);
        sOs.push(2);
        sOs.push(3);
        sOs.push(4);
        sOs.push(5);
        sOs.push(6);
        sOs.push(7);
        sOs.push(8);



        System.out.println(sOs.stacks.get(1).peek());
    }
}
