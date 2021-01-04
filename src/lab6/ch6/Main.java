package lab6.ch6;

public class Main {

    public static void spiralMatrix(int[][] mat, int startRow, int endRow, int startCol, int endCol)
    {
        for(int i=startCol; i<endCol; i++)
            System.out.print(mat[startRow][i] + " ");

        for(int i=startRow; i<endRow; i++)
            System.out.print(mat[i][endCol] + " ");

        for(int i=endCol; i>startCol; i--)
            System.out.print(mat[endRow][i] + " ");

        for(int i=endRow; i>startRow; i--)
            System.out.print(mat[i][startCol] + " ");

        if(endRow-startRow>1 && endCol-startCol>1)
            spiralMatrix(mat, startRow+1, endRow-1, startCol+1, endCol-1);
    }

    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        mat[0] = new int[]{1, 2, 3, 4};
        mat[1] = new int[]{12, 13, 14, 5};
        mat[2] = new int[]{11, 16, 15, 6};
        mat[3] = new int[]{10, 9, 8, 7};

        System.out.println("Original:\n");
        for(int i =0; i< mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.print("\n");
        }

        System.out.println("\nSpiral:");
        spiralMatrix(mat, 0, mat.length-1, 0, mat[0].length-1);
    }
}
