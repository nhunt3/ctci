package TreesAndGraphs.MinimalTree;

/**
 * Created by nick on 9/22/2015.
 */
public class QuestionGayle
{
    public static void main(String a[])
    {
        int[] arr = new int[7];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 7;
        arr[4] = 9;
        arr[5] = 12;
        arr[6] = 13;

        NodeGayle root = CreateMinimalBST(arr);

        System.out.println(root.left.left.data);
        System.out.println(root.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.data);
        System.out.println(root.right.left.data);
        System.out.println(root.right.data);
        System.out.println(root.right.right.data);
    }

    public static NodeGayle CreateMinimalBST(int[] array)
    {
        return CreateMinimalBST(array, 0, array.length - 1);
    }

    public static NodeGayle CreateMinimalBST(int[] arr2, int start, int end)
    {
        if (end < start)
        {
            return null;
        }

        int mid = (start + end) / 2;
        NodeGayle n = new NodeGayle(arr2[mid]);
        n.left = CreateMinimalBST(arr2, start, mid - 1);
        n.right = CreateMinimalBST(arr2, mid + 1, end);

        return n;
    }
}
