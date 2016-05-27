package Ch04TreesAndGraphs.Q06Successor;

/**
 * Created by nick on 4/27/2016.
 */
public class Successor
{
    public static Node Successor(Node n)
    {
        if (n.right != null)
        {
            return GoLeft(n.right);
        }
        else // if (n.right == null)
        {
            while (true)
            {
                if (n.parent == null)
                {
                    return new Node(-1);
                }
                else if (n.parent.data > n.data)
                {
                    return n.parent;
                }
                else
                {
                    n = n.parent;
                }
            }
        }
    }

    public static Node GoLeft(Node n)
    {
        if (n.left != null)
        {
            return GoLeft(n.left);
        }
        else
        {
            return n;
        }
    }

    public static void main(String[] args)
    {
        Node n = new Node(8);
        n.left = new Node(4); n.left.parent = n;
        n.left.left = new Node(2); n.left.left.parent = n.left;
        n.left.right = new Node(6); n.left.right.parent = n.left;
        n.left.right.left = new Node(5); n.left.right.left.parent = n.left.right;
        n.left.right.right = new Node(7); n.left.right.right.parent = n.left.right;

        n.right = new Node(10); n.right.parent = n;
        n.right.left = new Node(9); n.right.left.parent = n.right;
        n.right.right = new Node(14); n.right.right.parent = n.right;
        n.right.right.left = new Node(11); n.right.right.left.parent = n.right.right;
        n.right.right.right = new Node(16); n.right.right.right.parent = n.right.right;

        System.out.println(Successor(n.left.right.right).data);
    }
}
