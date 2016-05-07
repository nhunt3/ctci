package Ch08RecursionAndDynamicProgramming.Q02RobotInAGrid;

import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by nick on 11/9/2015.
 */
public class RobotInAGridMemo
{
    public static boolean[][] grid = new boolean[6][5]; // false = empty, true = blockade
    public static LinkedList<String> path = new LinkedList<String>();
    public static boolean[][] beenThere = new boolean[6][5];
    public static int count = 0;

    public static void main(String[] args)
    {
        grid[5][3] = true;
        grid[4][3] = true;
        grid[3][3] = true;

        boolean pathExists = Traverse(grid, 0, 0);

        if (!pathExists)
        {
            System.out.println("No path exists.");
        }
        else
        {
            System.out.println("\nThe path is: ");
            for (int i = path.size()-1; i >= 0; i--)
            {
                System.out.println(path.get(i));
            }
        }

        System.out.println("Count: " + count);
    }

    public static boolean Traverse(boolean[][] grid, int row, int col)
    {
        count++;

        if (row < grid.length && col < grid[0].length) // make sure we're not out of bounds...
        {
            if (!beenThere[row][col])
            {
                beenThere[row][col] = true;

                if (grid[row][col] == false) // make sure there's not a blockade here...
                {
                    if (row == grid.length - 1 && col == grid[0].length - 1)
                    {
                        System.out.println("Finished the course!");
                        return true;
                    }

                    boolean down = Traverse(grid, row + 1, col);
                    //System.out.println("Row: " + row + ", Col: " + col);

                    if (down == true)
                    {
                        path.add(row + ", " + col);
                        return true;
                    }

                    boolean right = Traverse(grid, row, col + 1);
                    //System.out.println("Row: " + row + ", Col: " + col);

                    if (right == true)
                    {
                        path.add(row + ", " + col);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
