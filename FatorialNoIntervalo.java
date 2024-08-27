import java.util.Scanner;

public class FatorialNoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        
        for (int i = inicio; i <= fim; i++) {
            System.out.println("Fatorial de " + i + " = " + fatorial(i));
        }

        scanner.close();
    }

    
    public static long fatorial(int n) {
        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
