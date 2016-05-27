package StacksAndQueues;

/**
 * Created by nick on 8/22/2015.
 */
public class TestingClass
{
    public static void main(String[] args)
    {
        ThreeInOne<Integer> tio = new ThreeInOne<Integer>(2);
        tio.pushS1(5);
        tio.pushS1(6);
        tio.pushS2(7);
        tio.pushS2(8);
        tio.pushS2(9);
        tio.pushS1(100);
        tio.pushS2(50);
        tio.pushS1(40);
        //tio.pushS2(1000);
        //tio.pushS1(8);
        //System.out.println(swa.top);
        //tio.popS1();
        //System.out.println(tio.peekS1());
        //System.out.println(tio.getEntireStack());

        //StackWithArray<Integer> swa = new StackWithArray<Integer>(2);
        //swa.push(5);
        //swa.push(6);
        //System.out.println(swa.top);
        //swa.pop();
        Object[] entireStack = tio.getEntireStack();

        //System.out.println(swa.peek());

        for (int i = 0; i < entireStack.length; i++)
        {
            System.out.println(i + ": " + entireStack[i]);
        }


    }
}
