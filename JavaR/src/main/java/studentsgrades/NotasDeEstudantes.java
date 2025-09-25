package studentsgrades;

import java.util.Arrays;

public class NotasDeEstudantes {
    //Aumenta a nota no indice que o metodo  em 5 pontos
    //Se a nova nota for superior a 100, define como 100
    public static int[] improveGrade(int[] args, int indice) {
        args[indice] +=5 ;
        if(args[indice] > 100){
            args[indice] = 100;
        }

        return args;

    }
    //Substitui qualquer nota abaixo de 60 por 60
    public static int[] replaceFailingGrade(int[] args) {
        for(int i = 0; i < args.length; i++){
            if(args[i] < 60){
                args[i] = 60;
            }
        }

        return args;

    }
    //Adiciona 2 pontos a todas as notas
    public static int[] addBonusPoints(int[] args) {
        for(int i = 0; i < args.length; i++){
            args[i]+= 2;

        }

        return args;
    }

    public static void main(String[] args) {

        int[] grades = {70, 85, 55};

        improveGrade(grades, 0);
        System.out.print("After improving grade: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");


        replaceFailingGrade(grades);
        System.out.print("After replacing failing: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        addBonusPoints(grades);
        System.out.print("After adding bonus: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
