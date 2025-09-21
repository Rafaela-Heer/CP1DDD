import java.util.Scanner;

// 09 -  Leia um CPF como string (apenas dígitos ou com pontuação). Remova caracteres não numéricos, verifique se tem 11 dígitos e calcule os dois dígitos verificadores conforme a regra oficial (pesos 10..2 e 11..2). Informe Válido ou Inválido.

public class Ex09ValidadorCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um CPF: \n -> ");
        String cpfInput = scanner.nextLine();

        // Remove o que não é um dígito
        String cpfLimpo = "";
        for (int i = 0; i < cpfInput.length(); i++) {
            char c = cpfInput.charAt(i);
            if (c >= '0' && c <= '9') {
                cpfLimpo += c;
            }
        }

        if (cpfLimpo.length() != 11) {
            System.out.println("CPF inválido!");
            scanner.close();
            return;
        }

        // Tira os 9 primeiros dígitos
        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            int digito = cpfLimpo.charAt(i) - '0';
            soma1 += digito * (10 - i);
        }
        int resto1 = soma1 % 11;
        int digito1 = (resto1 < 2) ? 0 : (11 - resto1);

        if (digito1 != (cpfLimpo.charAt(9) - '0')) {
            System.out.println("CPF inválido");
            scanner.close();
            return;
        }

        // Segundo dígito verificador
        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            int digito = cpfLimpo.charAt(i) - '0';
            soma2 += digito * (11 - i);
        }
        int resto2 = soma2 % 11;
        int digito2 = (resto2 < 2) ? 0 : (11 - resto2);

        if (digito2 == (cpfLimpo.charAt(10) - '0')) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
        scanner.close();
    }
}
