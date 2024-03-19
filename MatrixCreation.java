public class MatrixCreation {
    public static void main(String[] args) {
        // Creating matrices A and B
        int[][] matrixA = new int[1][9];
        int[][] matrixB = new int[1][9];

        // Filling matrix A with numbers from 1 to 9
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 9; j++) {
                matrixA[i][j] = j + 1;
            }
        }

        // Filling matrix B with numbers from 9 to 1
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 9; j++) {
                matrixB[i][j] = 9 - j;
            }
        }

        // Printing matrix A
        System.out.println("Matrix A:");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        // Printing matrix B
        System.out.println("Matrix B:");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
