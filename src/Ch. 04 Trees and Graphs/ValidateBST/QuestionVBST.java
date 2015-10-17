package TreesAndGraphs.ValidateBST;

/**
 * Created by nick on 10/3/2015.
 */
public class QuestionVBST
{
    public static Integer last_printed = null;
    public static boolean checkBST(Node n) {
        if (n == null) {
            return true;
        }

        // Check / recurse left
        if (!checkBST(n.left)) {
            return false;
        }

        // Check current
        if (last_printed != null && n.data <= last_printed) {
            return false;
        }
        last_printed = n.data;

        // Check / recurse right
        if (!checkBST(n.right)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Node root = new Node(6);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        //node.left.data = 5;
        //node.left.right.data = 3;
        System.out.println(checkBST(root));
    }
}
