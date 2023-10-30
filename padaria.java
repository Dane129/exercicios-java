import java.util.Scanner;
public class padaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somapao =  0;
        double somabroa = 0;
        double soma = 0;
        double desconto = 0;
        double sobra = 0;

        System.out.println("Quantos pães vendeu? ");
        int pao = scanner.nextInt();

        System.out.println("Quantas broas vendeu? ");
        int broa = scanner.nextInt();

        somapao = pao * 0.12;
        somabroa = broa * 1.50;
        soma = somapao + somabroa;
        desconto = soma * 0.10;
        sobra = soma - desconto;

        double somaAR = Math.round(soma * 100.0) / 100.0;
        double sobraAR = Math.round(sobra * 100.0) / 100.0;
        double descontoAR = Math.round(desconto * 100.0) / 100.0;

        System.out.println("O valor total das vendas foi: " + somaAR + " E o valor a ser guardado é: " + descontoAR);
        System.out.println("Irá sobrar: " + sobraAR);

        scanner.close();

    }
}
