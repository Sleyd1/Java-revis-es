package fluxodecontroleavancado;

public class ValidarUser {
    public static String validateUsername(String username) {
        String[] caracteres = {"!","@","#","$","%","^","&","<",
                                "*","(",")","`","'",",",".",";",":"};
        if(username == null) return "Username cannot be null";
        if (username.isEmpty()) return "Username cannot be empty";
        if (!Character.isLetter(username.charAt(0))) return "Username must start with a letter";

        for (int i = 0; i < caracteres.length; i++){
            int index = username.indexOf(caracteres[i]);
            if (index > -1) return "Username cannot contain special characters";
        }

        if(username.length() < 5 || username.length() > 15) return "Username must be between 5 and 15 characters";

        return "Valid username";
    }
    public static void main(String[] args) {
        String userName = "";

        System.out.println(validateUsername(userName));

    }
}
