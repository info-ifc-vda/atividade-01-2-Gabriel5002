import java.util.Scanner;
public class triagulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro angulo: ");
        double angulo1 = scanner.nextDouble();

        System.out.print("Digite o segundo angulo: ");
        double angulo2 = scanner.nextDouble();

        System.out.print("Digite o terceiro angulo: ");
        double angulo3 = scanner.nextDouble();

        
        System.out.print("Digite o primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double lado3 = scanner.nextDouble();

       
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("O triangulo e Retangulo.");
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("O triangulo e Obtusangulo.");
        } else {
            System.out.println("O triangulo e Acutangulo.");
        }

        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triangulo e Equilatero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triangulo e Isosceles.");
        } else {
            System.out.println("O triangulo e Escaleno.");
        }

        scanner.close();
    }
}


