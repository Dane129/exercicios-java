import java.util.Scanner;

public class doisvaloresreais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Escreva outro número: ");
        int numero2 = scanner.nextInt();

        if ((numero1 > 5) && (numero2 < 5)) {
            System.out.println("VERDADEIROS");
        } else {
            System.out.println("FALSOS");
        }

        scanner.close();
    }
}
