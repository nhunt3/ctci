package StacksAndQueues;

/**
 * Created by nick on 8/31/2015.
 */
public class DoublyLinkedStackNode<T>
{
        public DoublyLinkedStackNode above;
        public DoublyLinkedStackNode below;
        public T data;

        public DoublyLinkedStackNode(T value)
        {
            this.data = value;
        }
}
