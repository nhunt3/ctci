package Ch04TreesAndGraphs.Q08FirstCommonAncestor;

public class Node
{
    public Node left;
    public Node right;
    public Node parent;
    public int uid;

    Node(int uid)
    {
        this.uid = uid;
    }
}

