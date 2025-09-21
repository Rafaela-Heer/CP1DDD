import java.util.Scanner;

// 03 - Leia três inteiros e imprima o maior.

public class Ex03MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:\n -> ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:\n -> ");
        int b = scanner.nextInt();
        System.out.println("Digite o terceiro número inteiro:\n -> ");
        int c = scanner.nextInt();

        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        System.out.println("O número " + maior + " é o maior. \n Ordem: " + a + " - " + b + " - " + c);
        scanner.close();
    }
}
