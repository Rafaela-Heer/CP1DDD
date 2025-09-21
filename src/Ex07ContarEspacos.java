import java.util.Scanner;

// 07 - Leia uma linha de texto e conte quantos espaços ela possui. Imprima apenas o número.

public class Ex07ContarEspacos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva um texto: \n -> ");
        String texto = scanner.nextLine();
        int espacos = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                espacos++;
            }
        }
        System.out.println("Tem " + espacos + " espaços neste texto.");
        scanner.close();
    }
}
