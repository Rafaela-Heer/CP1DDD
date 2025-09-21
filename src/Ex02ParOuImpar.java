import java.util.Scanner;

// 02 -  Leia um inteiro e imprima Par ou Impar.

public class Ex02ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: \n-> ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }
        scanner.close();
    }
}
