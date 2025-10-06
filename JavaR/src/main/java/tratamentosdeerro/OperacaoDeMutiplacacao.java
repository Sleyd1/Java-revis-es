package tratamentosdeerro;

public class OperacaoDeMutiplacacao {
    public static String multiplyNumbers(String num1, String num2, int index) {
        String[] matriz = new String[3];

        try {

            matriz[index] = String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
            return "";
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Invalid array index");
            return "";
        }
        return matriz[index];

    }
    public static void main(String[] args) {

        System.out.println(multiplyNumbers("abc","abc",2));

    }
}
