package Ch04TreesAndGraphs.Q03ListOfDepths;
import java.util.LinkedList;

/**
 * Created by nick on 9/25/2015.
 */
public class QuestionLOD
{
    public static void main(String a[])
    {
        Node root = new Node(6);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        LinkedList<Node> list = search(root);
        //System.out.println(list.size());
        int depth = 0;
        int col = 0;

        LinkedList<LinkedList<Node>> ListOfLists = new LinkedList<LinkedList<Node>>();
        ListOfLists.add(new LinkedList<Node>());

        for (Node i : list)
        {
            if (i != null)
            {
                if(col < Math.pow(2,depth))
                {
                    ListOfLists.getLast().add(i);
                }
                else
                {
                    col = 0;
                    ListOfLists.addLast(new LinkedList<Node>());
                    ListOfLists.getLast().add(i);
                    depth++;
                }
                col++;
                //System.out.println(i.data);
            }
        }


        for (int i = 0; i < ListOfLists.size(); i++)
        {
            LinkedList myList = ListOfLists.get(i);
            for (int j = 0; j < myList.size(); j++)
            {
                Node myNode = (Node)myList.get(j);
                System.out.println(myNode.data);
            }
            System.out.println("\n");
        }
    }

    public static LinkedList search(Node root)
    {
        LinkedList<Node> FullQ = new LinkedList<Node>();

        LinkedList<Node> q = new LinkedList<Node>();
        q.add(root);
        FullQ.add(root);
        Node u;
        while(!q.isEmpty())
        {
            u = q.removeFirst();

            if (u != null)
            {
                //System.out.println(u.data);
                q.add(u.left);
                q.add(u.right);
                FullQ.add(u.left);
                FullQ.add(u.right);
            }
        }
        return FullQ;
    }
}
