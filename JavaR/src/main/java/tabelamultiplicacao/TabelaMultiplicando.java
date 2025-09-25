package tabelamultiplicacao;

public class TabelaMultiplicando {
    public static void main(String[] args) {
        System.out.println("Multiplication Table (1-5):");
        System.out.println("-------------------------");
        int firsL = 0;
        int tableValue = 0;
        int tablecolum = 0;

        for(int i = 0; i < 5; i++){
            firsL++;
                System.out.print(" "+ firsL);

        }
        System.out.println("");
        for(int i = 0; i < 5; i++){
            tablecolum++;
            tableValue = tablecolum;




            System.out.print(tablecolum);
            for (int f = 0 ; f < 5; f++){
                System.out.print(" "+ tableValue);
                tableValue += tablecolum;

            }
            System.out.println("");

        }
    }
}
