package ArraysAndStrings;

/**
 * Created by nick on 8/5/2015.
 */
public class RotateMatrix2
{
    static int[][] RotMat(int[][] matrix)
    {
        int k = -10000;

        for (int i = 0; i < matrix.length; i++)
        {
            int[] sub = matrix[i];

            if (i == 0)
            {
                k = sub.length - 1;
            }

            for (int j = 0; j < sub.length; j++)
            {
                matrix[j][k] = matrix[i][j];
            }

            k--;
        }

        return matrix;
    }

    static void PrintMatrix(int[][] matrix)
    {
        // Loop over top-level arrays.
        for (int i = 0; i < matrix.length; i++) {

            // Loop and display sub-arrays.
            int[] sub = matrix[i];
            for (int x = 0; x < sub.length; x++) {
                System.out.print(sub[x] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //ArraysAndStrings.RotateMatrix rM = new ArraysAndStrings.RotateMatrix();

        int[][] myMatrix = new int[4][4];

        myMatrix[0][0] = 1;
        myMatrix[0][1] = 2;
        myMatrix[0][2] = 3;
        myMatrix[0][3] = 4;
        myMatrix[1][0] = 5;
        myMatrix[1][1] = 6;
        myMatrix[1][2] = 7;
        myMatrix[1][3] = 8;
        myMatrix[2][0] = 9;
        myMatrix[2][1] = 10;
        myMatrix[2][2] = 11;
        myMatrix[2][3] = 12;
        myMatrix[3][0] = 13;
        myMatrix[3][1] = 14;
        myMatrix[3][2] = 15;
        myMatrix[3][3] = 16;

        PrintMatrix(myMatrix);
        System.out.println();
        int[][] rotatedMatrix = RotMat(myMatrix);
        PrintMatrix(rotatedMatrix);
    }
}
