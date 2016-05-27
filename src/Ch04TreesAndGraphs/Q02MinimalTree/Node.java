package Ch04TreesAndGraphs.Q02MinimalTree;

/**
 * Created by nick on 9/20/2015.
 */
public class Node
{
    int data;
    Node left;
    Node right;

    public Node SetValue(int d)
    {
        this.data = d;
        return this;
    }

    public Node AddLeft()
    {
        Node L = new Node();
        //L.data = d;
        this.left = L;
        return L;
    }

    public Node AddRight()
    {
        Node R = new Node();
        //R.data = d;
        this.right = R;
        return R;
    }
}
