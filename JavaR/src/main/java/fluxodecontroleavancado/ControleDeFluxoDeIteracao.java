package fluxodecontroleavancado;

public class ControleDeFluxoDeIteracao {
    public static void skipNumber(int[][] grid, int skipValue, boolean skipRow) {

        visitarRow: for (int i = 0; i < grid.length; i++){

            visitarCol: for (int j = 0; j < grid[i].length; j++){

                if (skipRow && grid[i][j] == skipValue){
                    System.out.println("Skipping row: " + i);
                    break visitarRow;

                } else if( grid[i][j] == skipValue) {
                    continue visitarCol;
                }

                System.out.print("Visited: ");
                System.out.print(i +","+ j+"\n");



            }


        }
    }
    public static void main(String[] args) {
        int[][] number = {{1,2},{3,4},{5,6}};
        int skipValue = 5;
        boolean skipRow = false;
        skipNumber(number,skipValue,skipRow);
    }
}
