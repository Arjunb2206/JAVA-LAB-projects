public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] A = { {1, 2, 3}, {4, 5, 6} };

        int rows = A.length;
        int cols = A[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = A[i][j];
            }
        }

        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
