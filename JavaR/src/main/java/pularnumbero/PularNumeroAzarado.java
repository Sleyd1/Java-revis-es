package pularnumbero;
//trabalhando com o uso de continue

public class PularNumeroAzarado {
    public static void main(String[] args) {
        System.out.println("Lista de compras");

        int contagem = 0;

        for(int i = 0; i < 20; i ++){
            contagem++;

            boolean verificarNumeroAzarado = (contagem == 4) || (contagem == 13) || (contagem == 17);
            if(verificarNumeroAzarado){
                System.out.println("Skipping unlucky number: " + contagem);
                continue;
            }

            System.out.printf("Item #%d\n", contagem);


        }
    }
}
