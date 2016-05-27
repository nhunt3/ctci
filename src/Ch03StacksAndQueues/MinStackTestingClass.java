package StacksAndQueues;

/**
 * Created by nick on 8/29/2015.
 */
public class MinStackTestingClass
{
        public static void main(String[] args)
        {
            MinStack ms = new MinStack();
            ms.push(9);
            ms.push(15);
            ms.push(10);
            ms.push(8);
            ms.push(2);
            ms.push(6);
            ms.pop();
            ms.pop();
            ms.pop();
            System.out.println(ms.getMin());
        }
}
