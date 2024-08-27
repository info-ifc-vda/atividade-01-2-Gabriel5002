import java.util.Scanner;

public class ContagemNumerosPrimos {

    
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPrimos = 0;

        System.out.println("Digite 10 numeros inteiros:");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (isPrimo(numero)) {
                contadorPrimos++;
            }
        }

        System.out.println("Quantidade de numeros primos: " + contadorPrimos);
    }
}

