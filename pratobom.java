import java.util.Scanner;
public class pratobom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco = 12;
        double prato = 0.8;

        System.out.println("Quantos quilos o prato pesa? ");
        double kilo = scanner.nextDouble();

        double pratomontado = kilo - prato;
        double resultado = pratomontado * preco;
        double resultadoAR = Math.round(resultado * 100.00) / 100.00;

        System.out.println("O valor será: " + resultadoAR);

        scanner.close();
    }
}
