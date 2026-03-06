package arrays.problems;
public class SparseMatrix {
    static void main(String[] args) {
        int[][] matrix={
            {0,0,3},
            {0,0,0},
            {4,0,0}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;//only do it for a square matrix
        int ZeroCount = 0;
        int nonZeroCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    ZeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }
        System.out.println("Zeros:" + ZeroCount);
        System.out.println(" Non Zeros:" + nonZeroCount);
        System.out.println(ZeroCount>nonZeroCount ? "Sparse":"NotSparse");
    }
}