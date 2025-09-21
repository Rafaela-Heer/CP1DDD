import java.util.Scanner;

// 06 - Leia um inteiro n e diga se é primo testando divisores até [√n].

public class Ex06PrimoAteRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro:\n-> ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Não é primo");
            scanner.close();
            return;
        }

        boolean ehPrimo = true;
        int raiz = (int) Math.sqrt(n);
        for (int i = 2; i <= raiz; i++) {
            if (n % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
        scanner.close();
    }
}
