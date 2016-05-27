package StacksAndQueues;

import java.util.ArrayList;

/**
 * Created by nick on 8/30/2015.
 */
public class SetOfStacks
{
    public ArrayList<Stack> stacks = new ArrayList<Stack>();
    public int capacity;

    public SetOfStacks(int capacity)
    {
        this.capacity = capacity;
    }

    public void PopAt(int i)
    {
        Stack last = getLastStack();


    }

    public void push(int data)
    {
        Stack last = getLastStack();

        if (last != null && !last.isFull())
        {
            last.push(data);
        }
        else
        {
            // create new stack
            Stack stack = new Stack(capacity);
            stack.push(data);
            stacks.add(stack);
        }
    }

    public Stack getLastStack()
    {
        if (stacks.size() == 0)
        {
            return null;
        }

        return stacks.get(stacks.size() - 1);
    }

    public void pop()
    {
        Stack last = getLastStack();
        if (last == null)
        {
            System.out.println("There's no stack to pop.");
            return;
        }

        last.pop();

        if (last.size == 0)
        {
            stacks.remove(stacks.size() - 1);
        }
    }

    public boolean isEmpty()
    {
        Stack last = getLastStack();
        return last == null || last.isEmpty();
    }
}
