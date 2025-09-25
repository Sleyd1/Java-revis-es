package identificadordenumerosprimos;
//trabalhando com o uso de break


public class IdentificarNumerosPrimos {
    public static void main(String[] args) {
        int number = 100;
        boolean isPrime = true;

        System.out.println("Checking if " + number + " is prime...");

        int contador = 0;
        int condatorDeDivisoes = 0;
        while (contador < number){
            contador+= 1;
            if (number % contador == 0){
                condatorDeDivisoes += 1;
            }
            if (condatorDeDivisoes > 2){
                isPrime = false;
                break;
            }


        }

        System.out.println(number + " is " + (isPrime ? "prime!" : "not prime!"));
    }
}
