package StacksAndQueues;

/**
 * Created by nick on 8/29/2015.
 */
public class MinStack
{
    private MinStackNode mTop;
    private MinStackNode currMin;

    private class MinStackNode
    {
        private int data;
        private MinStackNode next;
        private MinStackNode prevMin;

        public MinStackNode(int data)
        {
            this.data = data;

            if (currMin == null)
            {
                currMin = this;
            }
            else if (data < currMin.data)
            {
                this.prevMin = currMin;
                currMin = this;
            }
        }
    }

    public void push(int item)
    {
        MinStackNode t = new MinStackNode(item);
        t.next = mTop;
        mTop = t;
    }

    public void pop()
    {
        if (mTop == currMin)
        {
            currMin = mTop.prevMin;
        }

        if (mTop == null)
        {
            System.out.println("Nothing to pop.");
        }
        else
        {
            mTop = mTop.next;
        }
    }

    public int getMin()
    {
        return currMin.data;
    }
}
