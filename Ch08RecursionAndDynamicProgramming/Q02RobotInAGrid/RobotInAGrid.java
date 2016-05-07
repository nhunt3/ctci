package Ch08RecursionAndDynamicProgramming.Q02RobotInAGrid;

import java.util.LinkedList;

/**
 * Created by nick on 11/7/2015.
 */
public class RobotInAGrid
{
    public static int counter = 0;
    public static boolean done = false;
    public LinkedList<String> path;

    public static void main(String[] args)
    {
        boolean[][] grid = new boolean[6][5];
        grid[1][1] = true;
        grid[2][0] = true;
        grid[1][3] = true;
        grid[2][4] = true;
        grid[3][4] = true;
        grid[4][3] = true;

        Traverse(grid, 0, 0);
    }

    public static void Traverse(boolean[][] grid, int row, int col)
    {
        if (row < grid.length && col < grid[0].length) // make sure we're not out of bounds...
        {
            if(grid[row][col] == false) // make sure there's not a blockade here...
            {
                if(row == grid.length - 1 && col == grid[0].length - 1)
                {
                    System.out.println("Finished the course!");
                    done = true;
                }

                if (done == false)
                {
                    Traverse(grid, row + 1, col);
                    counter++;
                    System.out.println(counter + " Row: " + row + ", Col: " + col);

                    Traverse(grid, row, col + 1);
                    counter++;
                    System.out.println(counter + " Row: " + row + ", Col: " + col);
                }
            }
        }

        //counter++;
        //System.out.println(counter + " Row: " + row + ", Col: " + col);
    }
}
