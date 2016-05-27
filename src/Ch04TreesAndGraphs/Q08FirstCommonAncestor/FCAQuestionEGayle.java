package Ch04TreesAndGraphs.Q08FirstCommonAncestor;

public class FCAQuestionEGayle {
    public static class Result {
        public Node node;
        public boolean isAncestor;
        public Result(Node n, boolean isAnc) {
            node = n;
            isAncestor = isAnc;
        }
    }

    public static Result commonAncestorHelper(Node root, Node p, Node q) {
        if (root == null) {
            return new Result(null, false);
        }
        if (root == p && root == q) {
            return new Result(root, true);
        }

        Result rx = commonAncestorHelper(root.left, p, q);
        if (rx.isAncestor) { // Found common ancestor
            return rx;
        }

        Result ry = commonAncestorHelper(root.right, p, q);
        if (ry.isAncestor) { // Found common ancestor
            return ry;
        }

        if (rx.node != null && ry.node != null) {
            return new Result(root, true); // This is the common ancestor
        } else if (root == p || root == q) {
			/* If we�re currently at p or q, and we also found one of those
			 * nodes in a subtree, then this is truly an ancestor and the
			 * flag should be true. */
            boolean isAncestor = rx.node != null || ry.node != null;
            return new Result(root, isAncestor);
        } else {
            return new Result(rx.node != null ? rx.node : ry.node, false);
        }
    }

    public static Node commonAncestor(Node root, Node p, Node q) {
        Result r = commonAncestorHelper(root, p, q);
        if (r.isAncestor) {
            return r.node;
        }
        return null;
    }

    public static void main(String[] args) {
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

        System.out.println(commonAncestor(root, root.right.left, root.right.left).uid);

        //System.out.println(FindFCA(root, root.right.left.left.right, root.right.left.right.left).uid);
    }

}

