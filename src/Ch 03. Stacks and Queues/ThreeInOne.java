package StacksAndQueues;

/**
 * Created by nick on 8/23/2015.
 */
public class ThreeInOne<T>
{
    T[] stack;
    public int top1, top2, top3;

    public ThreeInOne(int sizeOfEachStack)
    {
        stack = (T[])new Object[sizeOfEachStack * 3];
        top1 = -1;
        top2 = sizeOfEachStack - 1;
        top3 = 123;
    }

    public T[] getEntireStack()
    {
        return stack;
    }

    public int getStackLength()
    {
        return stack.length;
    }

    public void pushS1(T data)
    {
        if (top1 + 1 >= stack.length * 1/3)
        {
            //make array bigger
            T [] biggerStack = (T[])new Object[stack.length * 2];

            for (int i = 0; i < stack.length * 1 / 3; i++)
            {
                biggerStack[i] = stack[i];
            }
            int i = stack.length * 1 / 3;
            int j = biggerStack.length * 1 / 3;
            while (i < stack.length * 2 / 3)
            {
                biggerStack[j] = stack[i];
                i++;
                j++;
            }
            top1 = j - 1;
            i = stack.length * 2 / 3;
            j = biggerStack.length * 2 / 3;
            while (i < stack.length * 3 / 3)
            {
                biggerStack[j] = stack[i];
                i++;
                j++;
            }

            stack = (T[])new Object[stack.length * 2];
            stack = biggerStack;
            biggerStack = null;
        }

        top1++;
        stack[top1] = data;
    }

    public void pushS2(T data)
    {
        if (top2 + 1 >= stack.length * 2/3)
        {
            //make array bigger
            T [] biggerStack = (T[])new Object[stack.length * 2];

            for (int i = 0; i < stack.length * 1 / 3; i++)
            {
                biggerStack[i] = stack[i];
            }
            int i = stack.length * 1 / 3;
            int j = biggerStack.length * 1 / 3;
            while (i < stack.length * 2 / 3)
            {
                biggerStack[j] = stack[i];
                i++;
                j++;
            }
            top2 = j - 1;
            i = stack.length * 2 / 3;
            j = biggerStack.length * 2 / 3;
            while (i < stack.length * 3 / 3)
            {
                biggerStack[j] = stack[i];
                i++;
                j++;
            }

            stack = (T[])new Object[stack.length * 2];
            stack = biggerStack;
            biggerStack = null;
        }

        top2++;
        stack[top2] = data;
    }

    public void popS1()
    {
        if (top1 == -1)
        {
            System.out.println("Nothing to pop. The array is empty.");
        }
        else
        {
            stack[top1] = null;
            top1--;
        }
    }

    public T peekS1()
    {
        if(top1 == -1)
        {
            System.out.println("Nothing to peek at. The array is empty.");
            return null;
        }
        else
        {
            return stack[top1];
        }
    }

    public boolean isEmptyS1()
    {
        return stack[top1] == null;
    }
}
