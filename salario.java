import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o numero de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o seu salario: ");
        double valorHora = scanner.nextDouble();

       
        double salarioBruto = horasTrabalhadas * valorHora;

        
        double imposto = salarioBruto * 0.30;

        
        double salarioReceber = salarioBruto - imposto;

    
        System.out.printf("Salario Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Salario a Receber: R$ %.2f%n", salarioReceber);
        
        scanner.close();
    }
}

