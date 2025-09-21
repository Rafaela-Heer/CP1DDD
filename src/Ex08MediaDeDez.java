import java.util.Scanner;

// 08 -  Leia exatamente 10 inteiros (sem armazenar) e imprima a média aritmética (com casas decimais). Também imprima o menor e o maior lidos.

public class Ex08MediaDeDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° número: \n -> ");
            int num = scanner.nextInt();
            soma += num;
            if (num < menor) menor = num;
            if (num > maior) maior = num;
        }

        double media = soma / 10;
        System.out.printf("Média: " + "%.2f\n", media);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        scanner.close();
    }
}
