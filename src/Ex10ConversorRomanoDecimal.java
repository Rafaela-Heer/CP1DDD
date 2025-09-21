import java.util.Scanner;

// Leia uma entrada única. Se for um número decimal entre 1 e 3999, imprima o equivalente em algarismos romanos. Caso contrário, trate como um número romano válido (maiúsculas) e imprima o decimal. Não use vetores; implemente com if/while e operações com String.

public class Ex10ConversorRomanoDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro ou um número romano: \n -> ");
        String entrada = scanner.nextLine().trim();

        // Tenta converter como decimal
        boolean isDecimal = true;
        int num = 0;
        try {
            num = Integer.parseInt(entrada);
            if (num < 1 || num > 3999) {
                isDecimal = false;
            }
        } catch (NumberFormatException e) {
            isDecimal = false;
        }

        if (isDecimal) {
            // Decimal para Romano
            String romano = "";
            romano += milhares(num);
            num %= 1000;
            romano += centenas(num);
            num %= 100;
            romano += dezenas(num);
            num %= 10;
            romano += unidades(num);
            System.out.println(romano);
        } else {
            // Romano para Decimal (assume válido, como dito no enunciado)
            int decimal = 0;
            for (int i = 0; i < entrada.length(); i++) {
                char c = entrada.charAt(i);
                if (i + 1 < entrada.length() && valor(c) < valor(entrada.charAt(i + 1))) {
                    // Subtrativo: IV, IX, etc.
                    decimal += valor(entrada.charAt(i + 1)) - valor(c);
                    i++;  // Pula o próximo
                } else {
                    decimal += valor(c);
                }
            }
            System.out.println(decimal);
        }
        scanner.close();
    }

    // Funções auxiliares static para conversão
    public static String milhares(int n) {
        String res = "";
        int m = n / 1000;
        res += "M".repeat(m);
        return res;
    }

    public static String centenas(int n) {
        String res = "";
        int c = n / 100;
        if (c == 9) res = "CM";
        else if (c >= 5) {
            res = "D";
            res += "C".repeat(c - 5);
        } else if (c == 4) res = "CD";
        else res = "C".repeat(c);
        return res;
    }

    public static String dezenas(int n) {
        String res = "";
        int d = n / 10;
        if (d == 9) res = "XC";
        else if (d >= 5) {
            res = "L";
            res += "X".repeat(d - 5);
        } else if (d == 4) res = "XL";
        else res = "X".repeat(d);
        return res;
    }

    public static String unidades(int n) {
        String res = "";
        int u = n % 10;
        if (u == 9) res = "IX";
        else if (u >= 5) {
            res = "V";
            res += "I".repeat(u - 5);
        } else if (u == 4) res = "IV";
        else res = "I".repeat(u);
        return res;
    }

    public static int valor(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
