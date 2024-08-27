import java.util.Scanner;

public class quilowatt {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o seu salario: ");
        int salario = scanner.nextInt();

        System.out.print("Digite o tempo de uso de luz: ");
        double tempoLuz = scanner.nextDouble();

       
        double valorQui = tempoLuz * 0.92;

        
        double luz = salario * 0.01;

        double pagar = luz * valorQui;
    
        System.out.printf("Valor de cada quilowott: R$ %.2f%n", valorQui);
        System.out.printf("O valor que terra que pagar e: R$ %.2f%n", pagar);
        
        scanner.close();   
    }
}