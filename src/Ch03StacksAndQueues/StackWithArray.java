package StacksAndQueues;

import java.io.Console;

/**
 * Created by nick on 8/22/2015.
 */
public class StackWithArray<T>
{
    T[] stack;
    public int top;

    public StackWithArray(int arraySize)
    {
        stack = (T[])new Object[arraySize];
        top = -1;
    }

    public T[] getEntireStack()
    {
        return stack;
    }

    public void push(T data)
    {
        if (top + 1 > stack.length - 1)
        {
            //make array bigger
            //int currentStackLength = stack.length;
            T [] biggerStack = (T[])new Object[stack.length * 2];

            for (int i = 0; i < stack.length; i++)
            {
                biggerStack[i] = stack[i];
            }

            stack = (T[])new Object[stack.length * 2];
            stack = biggerStack;
            biggerStack = null;
        }

        top++;
        stack[top] = data;
    }

    public void pop()
    {
        if (top == -1)
        {
            System.out.println("Nothing to pop. The array is empty.");
        }
        else
        {
            stack[top] = null;
            top--;
        }
    }

    public T peek()
    {
        if(top == -1)
        {
            System.out.println("Nothing to peek at. The array is empty.");
            return null;
        }
        else
        {
            return stack[top];
        }
    }

    public boolean isEmpty()
    {
        return stack[top] == null;
    }
}
