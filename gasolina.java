import java.util.Scanner;
public class gasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gasolina = 5.74;

        System.out.println("Valor que deseja botar de gasolina: ");
        double valor = scanner.nextDouble();

        double soma = valor / gasolina;
        double somaAR = Math.round(soma * 100.0) / 100.0;

        System.out.println("Você conseguirá botar: " + somaAR + " litros de gasolina");

        scanner.close();
    }
}
