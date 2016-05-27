package Ch04TreesAndGraphs.Q05ValidateBST;

/**
 * Created by nick on 4/27/2016.
 */
public class ValidateBST
{
    private static int prevNodeValue = 0;
    private static int closestRightParent = 0;

    public static boolean CompareCurrToPrev(int currVal)
    {
        if (currVal >= prevNodeValue && currVal > closestRightParent)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isBST(Node node)
    {
        if (node != null)
        {
            // Recurse Left
            boolean leftBST = isBST(node.left);
            if (!leftBST)
            {
                return false;
            }

            // Visit node
            boolean doBST = CompareCurrToPrev(node.data);
            if (!doBST)
            {
                return false;
            }
            prevNodeValue = node.data;

            // Recurse right
            closestRightParent = node.data;
            boolean rightBST = isBST(node.right);
            if (!rightBST)
            {
                return false;
            }
            closestRightParent = 0;
        }

        return true;
    }

//    public static void main(String[] args)
//    {
//        TreeNode root = new TreeNode(8);
//        root.left = new TreeNode(4);
//        root.left.left = new TreeNode(2);
//        root.left.right = new TreeNode(6);
//        root.left.right.left = new TreeNode(5);
//        root.left.right.right = new TreeNode(7);
//        root.right = new TreeNode(10);
//        root.right.left = new TreeNode(9);
//        root.right.right = new TreeNode(14);
//        root.right.right.left = new TreeNode(11);
//        root.right.right.right = new TreeNode(16);
//
//        System.out.println(isBST(root));
//    }

    public static void main(String[] args)
    {
        Node root = new Node(8);
        root.left = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(7);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(14);
        root.right.right.left = new Node(11);
        root.right.right.right = new Node(16);

        System.out.println(isBST(root));
    }
}
