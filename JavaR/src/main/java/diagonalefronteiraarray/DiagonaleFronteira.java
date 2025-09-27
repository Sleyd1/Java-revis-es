package diagonalefronteiraarray;

import java.util.Arrays;

public class DiagonaleFronteira {
    public static void printAdvancedPatterns(int[][] matrix) {
        int size = matrix.length;

        System.out.print("Both Diagonals: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");  // diagonal Principal
        }

        for (int i = 0; i < size; i++) {
            if (i != size - 1 - i) {
                System.out.print(matrix[i][size - 1 - i] + " ");  // Anti-diagonal
            }
        }
        System.out.println();


        System.out.print("Spiral Order: ");
        int top = 0, bottom = size - 1, left = 0, right = size - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] exemplo = {
                {1,2,3},
                {5,6,7},
                {8,9,10}};
        printAdvancedPatterns(exemplo);
    }
}
