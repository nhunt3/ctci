package StacksAndQueues;
import java.util.EmptyStackException;

/**
 * Created by nick on 8/21/2015.
 */
public class Stack<T>
{
    private StackNode<T> top, bottom;
    private int capacity;
    public int size = 0;

    public Stack(int capacity)
    {
        this.capacity = capacity;
    }

    private static class StackNode<T>
    {
        private T data;
        private StackNode<T> next;

        public StackNode(T data)
        {
            this.data = data;
        }
    }

    public void pop()
    {
        if (top == null)
        {
            System.out.println("Nothing to pop.");
        }
        else
        {
            top = top.next;
            size--;
        }
    }

    public void push(T item)
    {
        StackNode<T> t = new StackNode<T>(item);

        if (size == 0)
        {
            bottom = t;
        }

        t.next = top;
        top = t;
        size++;
    }

    public T peek()
    {
        if (top == null)
        {
            System.out.println("Stack is empty");
        }

        return top.data;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return capacity == size;
    }
}
