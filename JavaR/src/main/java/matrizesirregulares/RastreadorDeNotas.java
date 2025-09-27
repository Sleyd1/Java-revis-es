package matrizesirregulares;

import java.util.Arrays;

public class RastreadorDeNotas {
    public static int[][] processGrades(int numStudents, int[] subjectsPerStudent) {

        int[][] matrizAluno = new int[numStudents][];
        for (int i = 0; i < matrizAluno.length; i++) {
                matrizAluno[i] = new int[subjectsPerStudent[i]];

                for(int j = 0; j < matrizAluno[i].length; j++){
                    //Arrays.fill(matrizAluno[i],10);
                    matrizAluno[i][j] = (i + 1) * 10 + (j + 1);
                }
        }

        return matrizAluno;
    }

    public static void main(String[] args) {
        int numStudent = 3;
        int[] subjasent = {2,4,2};
        int[][] result = processGrades(numStudent,subjasent);
        System.out.println(Arrays.deepToString(result));

    }

}
