package Ch04TreesAndGraphs.Q08FirstCommonAncestor;

/**
 * Created by nhunt on 5/14/2016.
 */
public class FirstCommonAncestor
{
    public static boolean FindFCA(Node n, Node c1, Node c2)
    {
        boolean foundAMissingNode = false;

        // if the missing nodes are the same node, then that node is the First Commmon Ancestor
        if (c1 == c2)
        {
            System.out.println("Found the first common ancestor! The uid is " + c1.uid);
            return true;
        }

        if (n == null)
        {
            return false;
        }
        else if (n == c1 || n == c2)
        {
            foundAMissingNode = true;
        }

        boolean LeftBranchHasMissingNode = FindFCA(n.left, c1, c2);
        boolean RightBranchHasMissingNode = FindFCA(n.right, c1, c2);

        if (
            // case when the 2 missing nodes are children of the First Common Ancestor
                (LeftBranchHasMissingNode && RightBranchHasMissingNode)
                        ||
                        // case when one of the missing nodes if a child of the FCA and the other node IS the FCA
                        ((LeftBranchHasMissingNode || RightBranchHasMissingNode) && foundAMissingNode)
                )
        {
            System.out.println("Found the first common ancestor! The uid is " + n.uid);
            return true;
        }
        else if (LeftBranchHasMissingNode || RightBranchHasMissingNode || foundAMissingNode)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.right.left.left = new Node(8);
        root.right.left.right = new Node(9);
        root.right.left.left.left = new Node(10);
        root.right.left.left.right = new Node(11);
        root.right.left.right.left = new Node(12);
        root.right.left.right.right = new Node(13);

        FindFCA(root, root.right.left.left.left, root.right.left);

        //System.out.println(FindFCA(root, root.right.left.left.right, root.right.left.right.left).uid);
    }
}
