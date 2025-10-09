package operacoesavancadasdestring;

import java.util.Scanner;

public class ValidateInput {

    public static String validateInput(String text, String type) {
        if (text == null) {
            return "Invalid input";
        }

        switch (type) {
            case "number":
                return text.matches("[0-9]+") ? "Valid" : "Invalid";
            case "word":
                return text.matches("[a-zA-Z]+") ? "Valid" : "Invalid";
            case "email":
                return text.matches(".+@.+") ? "Valid" : "Invalid";
            case "phone":
                return text.matches("[0-9]{10}") ? "Valid" : "Invalid";
            default:
                return "Invalid type";
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite alguma coisa: ");
        String text = scanner.nextLine();
        System.out.println();
        System.out.print("digite o typo: ");
        String type = scanner.nextLine();

        if (text.equals("null")) text = null;
        System.out.println(validateInput(text, type));
        scanner.close();
    }
}
