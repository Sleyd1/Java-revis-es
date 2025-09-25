package studentsgrades;
import java.util.Arrays;

public class ListaDeAlunos {

    public static String[] createSeatingChart(String[] nomes,int[] args) {

        String[] array = new String[nomes.length];

        for(int i = 0; i < array.length; i++){
            array[i] = nomes[i] + ": "+ String.valueOf(args[i]);
        }
        Arrays.sort(array);
        return array;
    }

    public static String[] findTopStudents(int[] numbers) {

        String[] arrayNumbers = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            if(numbers [i] > 90){
                arrayNumbers[i] = "A+";
            }else {
                arrayNumbers[i] = "A";
            }
        }
        return arrayNumbers;
    }

    public static boolean isClassEqual(int[] numbers, int[] number2) {
        Arrays.sort(numbers);
        Arrays.sort(number2);
        int tamanhoDoAarray = numbers.length;
        int cont = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == number2[i]){
                cont++;
            }
        }

        if (cont == tamanhoDoAarray){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Test arrays
        String[] names = {"Tom", "Alice", "Bob"};
        int[] grades = {85, 92, 78};
        int[] grades2 = {85,92, 78};

        // Test first method
        String[] seatingChart = createSeatingChart(names, grades);
        System.out.print("Seating Chart: ");
        System.out.println(Arrays.toString(seatingChart));

        // Test second method
        String[] gradeLetters = findTopStudents(grades);
        System.out.print("Grade Letters: ");
        System.out.println(Arrays.toString(gradeLetters));

        // Test third method
        boolean equalClasses = isClassEqual(grades, grades2);
        System.out.println("Classes Equal: " + equalClasses);
    }
}
