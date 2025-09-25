package studentsgrades;

public class GradeBook {
    public static String getClassStats(int[] args) {
        int totalDeIndividuos = args.length;
        int totalNumber = 0;
        int maxima = 0;
        int minima = 100;
        for(int i = 0; i < args.length; i++){
            totalNumber+= args[i];
            if(maxima < args[i]){
                maxima = args[i];
            }

            if(minima > args[i] ){
                minima = args[i];
            }

        }
        double media = totalNumber / totalDeIndividuos;
        int numeroTotalDeAprovados = 0;
        for(int i = 0; i < args.length; i++){
            if(args[i] > 60){
                numeroTotalDeAprovados+= 1;
            }
        }

        return "Class Average: "+ media + "\n" +
                "Highest Grade: "+ maxima + "\n" +
                "Lowest Grade: "+ minima +"\n"+
                "Passing Grades: "+ totalDeIndividuos + "/" + numeroTotalDeAprovados
                ;

    }

    public static String getLetterGrades(int[] args) {
        int[] contagemNot = new int[5];

        for(int i = 0; i < args.length; i++){

            if(args[i] > 90 && args[i] < 100){
                contagemNot[0] += 1;
            }

            if(args[i] > 80 && args[i] < 90){
                contagemNot[1] += 1;
            }
            if(args[i] > 70 && args[i] < 80){
                contagemNot[2] += 1;
            }
            if(args[i] > 60 && args[i] < 70){
                contagemNot[3] += 1;
            }
            if(args[i] > 0 && args[i] < 60){
                contagemNot[4] += 1;
            }


        }

        return "A (90-100): "+ contagemNot[0] + "\n" +
                "B (80-89): "+ contagemNot[1] + "\n" +
                "C (70-79): "+ contagemNot[2] +"\n"+
                "D (60-69): "+ contagemNot[3] +"\n"+
                "F (0-59): "+ contagemNot[4]
                ;

    }

    public static String getImprovement(int[] start, int[] end) {
        double totalImprovement = 0;
        int maxImprovement = 0;
        int improved = 0;

        for (int i = 0; i < start.length; i++) {
            int diff = end[i] - start[i];
            totalImprovement += diff;
            if (diff > maxImprovement) maxImprovement = diff;
            if (diff > 0) improved++;
        }

        double avgImprovement = totalImprovement / start.length;

        return String.format("Average Improvement: %.1f points\n" +
                        "Most Improved: %d points\n" +
                        "Students Improved: %d/%d",
                avgImprovement, maxImprovement, improved, start.length);
    }




    public static void main(String[] args) {
        // Test data
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};


        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));


        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));

        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));

    }
}
