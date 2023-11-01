import java.util.Scanner;

public class positivonegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int resultado = numero * 2;
            System.out.println("O dobro é: " + resultado);
        }   else {
            int resultado = numero * 3;
            System.out.println("O triplo é: " + resultado);
        }

        scanner.close();
    }
}
