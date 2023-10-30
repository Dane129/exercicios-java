import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        System.out.println("Qual o valor do comprimento? ");
        double comprimento = scanner.nextDouble();

        System.out.println("Qual o valor da largura? ");
        double largura = scanner.nextDouble();

        soma = comprimento * largura;

        System.out.println("O valor da área do retângulo será: " + soma);

        scanner.close();

    }
}
