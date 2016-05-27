package StacksAndQueues;

import java.util.LinkedList;

/**
 * Created by nick on 9/13/2015.
 */
public class MyQueueTestingClass
{
    public static void main(String[] args)
    {
        MyQueue<Integer> my_queue = new MyQueue<Integer>();

        my_queue.add(1);
        my_queue.add(2);
        my_queue.add(3);
        my_queue.add(4);
        my_queue.add(5);
        my_queue.remove();
        my_queue.add(6);
        my_queue.remove();
        my_queue.remove();
        System.out.println(my_queue.peek());
        System.out.println(my_queue.peekTop());
    }
}
