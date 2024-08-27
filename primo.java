import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int nume = scanner.nextInt();
        if (nume <= 1) {
            System.out.println(nume+" nao e um numero primo. ");
        }else{
            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(nume); i++) {
                if (nume % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(nume + " e um numero primo.");
            } else {
                System.out.println(nume + " nao e um numero primo.");
            }
        } 
        scanner.close();
        
    }
}
