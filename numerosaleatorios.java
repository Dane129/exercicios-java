import java.util.Scanner;
public class numerosaleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int valor = 0;
        int x = 1;
        int positivo = 0;
        int negativo = 0;
        double resultado = 0;

        do {
            System.out.println("Digite um número: ");
            x = scanner.nextInt();

            if (x != 0) {
                soma++;
                valor += x;
            }

            if (x > 0) {
                positivo++;
            }

            if (x < 0) {
                negativo++;
            }

        } while (x != 0);

        resultado = (double) valor / soma;

        System.out.println("A média é: " + resultado);
        System.out.println("A quantidade de números positivos é: " + positivo);
        System.out.println("A quantidade de número negativos é: " + negativo);
    }
}
