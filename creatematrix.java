import java.util.Arrays;

public class creatematrix {
    public static void main(String[] args) {
        // Define the dimensions of the matrix
        int rows = 3;
        int cols = 4;

        // Create a 2D matrix using Arrays class
        int[][] matrix = new int[rows][cols];

        // Populate the matrix with values
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }

        // Print the matrix
        System.out.println("2D Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
