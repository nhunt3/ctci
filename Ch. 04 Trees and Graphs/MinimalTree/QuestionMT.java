package TreesAndGraphs.MinimalTree;

import java.lang.reflect.Array;
import java.util.LinkedList;

/**
 * Created by nick on 9/20/2015.
 */
public class QuestionMT
{
    static int count = 0;
    static int[] arr = new int[7];

    public static void main(String a[])
    {
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 7;
        arr[4] = 9;
        arr[5] = 12;
        arr[6] = 13;

        Node root = BuildTree(arr.length);
        SetValues(root);

        System.out.println(root.left.left.data);
        System.out.println(root.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.data);
        System.out.println(root.right.left.data);
        System.out.println(root.right.data);
        System.out.println(root.right.right.data);

    }

    public static void SetValues(Node n)
    {
        if (n != null)
        {
            SetValues(n.left);
            n.SetValue(arr[count]);
            count++;
            SetValues(n.right);
        }

        return;
    }

    public static Node BuildTree(int length)
    {
        int count = 0;
        Node root = new Node();
        LinkedList<Node> q = new LinkedList<Node>();
        q.add(root);
        count++;

        while(true)
        {
            Node n = q.removeFirst();
            Node L = n.AddLeft();
            q.add(L);

            count++;
            if (count >= length)
            {
                break;
            }

            Node R = n.AddRight();
            q.add(R);

            count++;
            if (count >= length)
            {
                break;
            }
        }

        return root;
    }
}
