package operacoesavancadasdestring;

public class MensagemPersonalizada {
    public static String buildMessage(String greeting, String name, String action, boolean excited) {
        StringBuilder mensage = new StringBuilder();
        if(greeting == null || name == null || action == null){
            return "Invalid input";
        }
        mensage.append(greeting +" ");
        mensage.append(" " +name+ " ");
        mensage.append("is");
        mensage.append(" "+action+".");

        if(excited){
            return mensage +"!";
        }
        String msage = String.valueOf(mensage);
        return msage;
    }
    public static void main(String[] args) {

        System.out.println(buildMessage("Hello", "Wesley", "learning Java", true));
    }
}
