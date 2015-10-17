package LinkedLists;

import java.util.HashSet;

/**
 * Created by nick on 8/7/2015.
 */
public class Node
{
    Node next = null;
    int data;

    public Node(int d)
    {
        data = d;
    }

    Node AppendToTail(int d)
    {
        Node end = new Node(d);
        Node n = this;

        while (n.next != null)
        {
            n = n.next;
        }

        n.next = end;

        return n.next;
    }

    Node DeleteNode(Node head, int d)
    {
        Node n = head;

        if (n.data == d)
        {
            return head.next;
        }

        while (n.next != null)
        {
            if (n.next.data == d)
            {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }

        return head;
    }

    void RemoveDups()
    {
        Node n = this;
        Node prev = n;

        int[] storage = new int[256];

        while (n != null)
        {
            if (storage[n.data] == 1)
            {
                prev.next = n.next;
            }
            else
            {
                storage[n.data] += 1;
                prev = n;
            }

            n = n.next;
        }
    }

    void RemoveDupsSolution1()
    {
        Node n = this;
        HashSet<Integer> set = new HashSet<Integer>();
        Node prev = null;

        while (n != null)
        {
            if (set.contains(n.data))
            {
                prev.next = n.next;
            }
            else
            {
                set.add(n.data);
                prev = n;
            }

            n = n.next;
        }
    }

    void RemoveDupsNoTB()
    {
        Node n = this;
        Node f;
        Node prev;

        while (n != null)
        {
            f = n.next;
            prev = n;

            while (f != null)
            {
                if(n.data == f.data)
                {
                    if(f.next != null)
                    {
                        prev.next = f.next;
                    }
                    else
                    {
                        prev.next = null;
                    }
                }
                else
                {
                    prev = f;
                }

                f = f.next;
            }

            n = n.next;
        }
    }

    void RemoveDupsNoTBSolution()
    {
        Node current = this;

        while (current != null)
        {
            Node runner = current;

            while (runner.next != null)
            {
                if (runner.next.data == current.data)
                {
                    runner.next = runner.next.next;
                }
                else
                {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }

    Integer KthToLast(Integer k)
    {
        Node n = this;
        Node runner = n;
        int countNodes = 0;

        while (runner != null)
        {
            countNodes++;

            if (countNodes > k)
            {
                n = n.next;
            }

            runner = runner.next;
        }

        return n.data;
    }

    int PrintKthToLastSol2AppA(Node head, int k)
    {
        if (head == null)
        {
            return 0;
        }

        int index = PrintKthToLastSol2AppA(head.next, k) + 1;

        if (index == k)
        {
            System.out.println(k + "th to last node is " + head.data);
        }

        return index;
    }

    void DeleteMiddleNode()
    {
        Node n = this;
        Node f = n;
        Node prev = null;

        while (f.next != null)
        {
            f = f.next.next;
            prev = n;
            n = n.next;
        }

        prev.next = n.next;
    }

    void DeleteMiddleNodeSolution(Node n)
    {
        if (n == null || n.next == null)
        {
            return;
        }

        n.data = n.next.data;
        n.next = n.next.next;
        return;
    }

    void Partition(int p)
    {
        Node n = this;
        Node prev = null;
        Node last = GetLastNodeHelperFunction(n);
        Node origLast = last;
        Node temp = null;

        while (n != origLast)
        {
            if (n.data >= p)
            {
                if (prev != null)
                {
                    prev.next = n.next;
                }

                temp = n.next;
                n.next = null;
                last.next = n;
                last = last.next;
                n = temp;
            }
            else
            {
                prev = n;
                n = n.next;
            }
        }
    }

    Node GetLastNodeHelperFunction(Node n)
    {
        while(n.next != null)
        {
            n = n.next;
        }

        return n;
    }

    Node PartitionSolution2(Node node, int x)
    {
        Node head = node;
        Node tail = node;

        while (node != null)
        {
            Node next = node.next;

            if (node.data < x)
            {
                node.next = head;
                head = node;
            }
            else
            {
                tail.next = node;
                tail = node;
            }

            node = next;
        }

        tail.next = null;

        return head;
    }

    public static void main(String[] args)
    {
        Node n = new Node(1);
        n.AppendToTail(10);
        n.AppendToTail(2);
        n.AppendToTail(3);
        n.AppendToTail(9);
        n.AppendToTail(11);
        n.AppendToTail(6);
        n.AppendToTail(4);
        n.AppendToTail(2);
        n.AppendToTail(5);
        //n.RemoveDupsSolution1();
        //n.RemoveDups();
        //n = n.DeleteNode(n, 8);
        //n.RemoveDupsNoTB();
        //n.RemoveDupsNoTBSolution();
        //Integer k = n.KthToLast(3);
        //System.out.println(k);
        //int k2 = n.PrintKthToLastSol2AppA(n, 3);
        //System.out.println(k2);
        //n.DeleteMiddleNode();
        //System.out.println(mN);
        //n.DeleteMiddleNodeSolution(myNode);

        //n.Partition(5);

        n = n.PartitionSolution2(n, 5);

        while(n.next != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}

