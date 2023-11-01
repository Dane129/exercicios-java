import java.util.Scanner;

public class doisinteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            int n3 = n1 + n2;
            System.out.println("A soma é: " + n3);
        }   else {
            int n3 = n1 * n2;
            System.out.println("A multiplicação é: " + n3);
        }

        scanner.close();
    }
}
