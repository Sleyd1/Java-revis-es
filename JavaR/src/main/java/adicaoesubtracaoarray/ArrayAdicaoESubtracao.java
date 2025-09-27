package adicaoesubtracaoarray;

import java.util.Arrays;

public class ArrayAdicaoESubtracao {
    public static int[][] matrixOperation(int[][] matrix1, int[][] matrix2, String operator) {
        // Write your code here
        int [][] matriz3 = new int[matrix1.length][matrix1[0].length];
        if(operator.equals("add")){
            for(int i = 0; i < matrix1.length; i++){
                for(int j = 0; j < matrix1[i].length; j++){
                    matriz3[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }

        if(operator.equals("subtract")){
            for(int i = 0; i < matrix1.length; i++){
                for(int j = 0; j < matrix1[i].length; j++){
                    matriz3[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return matriz3;

    }

    public static void main(String[] args) {
        int[][] matrix1 = {{16,28,37}, {10,77,45},{399,205,307}};
        int[][] matrix2 = {{15,22,30}, {12,70,49},{391,202,303}};

        int[][] result = matrixOperation(matrix1,matrix2, "subtract");
        System.out.println(Arrays.deepToString(result));
    }
}
