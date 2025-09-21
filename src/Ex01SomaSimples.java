import java.util.Scanner;

// 01 - Leia dois inteiros e imprima a soma.

public class Ex01SomaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque um número inteiro:\n -> ");
        int a = scanner.nextInt();
        System.out.print("Coloque outro número inteiro:\n -> ");
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + a + b);
        scanner.close();
    }
}
