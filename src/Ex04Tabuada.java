import java.util.Scanner;

// 04 - Leia um inteiro n e imprima sua tabuada de 1 a 10 (uma linha por produto).

public class Ex04Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro para receber a tabuada do mesmo:\n -> ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }
        scanner.close();
    }
}
