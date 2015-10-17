package StacksAndQueues;

public class DoublyLinkedStack<T>
{
    private DoublyLinkedStackNode<T> top, bottom;
    private int capacity;
    public int size = 0;

    public DoublyLinkedStack(int capacity)
    {
        this.capacity = capacity;
    }

    public T pop()
    {
        DoublyLinkedStackNode<T> t = top;

        if (top == null)
        {
            System.out.println("Nothing to pop.");
        }
        else
        {
            top = top.below;
            size--;
        }

        return t.data;
    }

    private void Join(DoublyLinkedStackNode above, DoublyLinkedStackNode below)
    {
        if (below != null) below.above = above;
        if (above != null) above.below = below;
    }

    public void push(T item)
    {
        DoublyLinkedStackNode<T> n = new DoublyLinkedStackNode<T>(item);

        if (size == 0)
        {
            bottom = n;
        }

        Join(n, top);
        top = n;
        size++;
    }

    public T RemoveBottom()
    {
        DoublyLinkedStackNode<T> b = bottom;
        bottom = bottom.above;

        if (bottom != null)
        {
            bottom.below = null;
        }

        size--;
        return b.data;
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
