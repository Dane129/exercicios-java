import java.util.Scanner;

public class mediaponderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite outra nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite mais uma nota: ");
        double nota3 = scanner.nextDouble();

        nota1 = nota1 * 1;
        nota2 = nota2 * 2;
        nota3 = nota3 * 3;

        double resultado = (nota1 + nota2 + nota3) / 3;
        double resultadoAR = Math.round(resultado * 100.00) / 100.00;

        System.out.println("A nota ponderada será: " + resultadoAR);

        scanner.close();
    }
}
