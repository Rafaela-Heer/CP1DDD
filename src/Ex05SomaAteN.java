import java.util.Scanner;

// 05 - Leia N ≥ 1 e calcule 1 + 2 + · · · + N usando laço e acumulador.

public class Ex05SomaAteN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro:\n-> ");
        int n = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " + ");
            soma += i;
        }
        System.out.println(" = " + soma);
        scanner.close();
    }
}
