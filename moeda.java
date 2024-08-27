import java.util.Scanner;
public class moeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cedulas = {200, 100, 50, 20, 10, 5, 2};

        System.out.print("Digite o valor do troco: R$ ");

        int troco = scanner.nextInt();

        System.out.println("Troco em cedulas:");
        for (int cedula : cedulas) {
            if (troco >= cedula) {
                int quantidade = troco / cedula;
                troco -= quantidade * cedula;
                System.out.println("Cedulas de R$ " + cedula + " : " + quantidade);
            }
        }
        if (troco > 0) {
            System.out.println("Valor restante (nao e possivel representar com as cedulas disponiveis): R$ " + troco);
        }
        scanner.close();
    }
}
