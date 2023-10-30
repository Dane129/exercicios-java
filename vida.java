import java.util.Scanner;
public class vida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        int tempovida = idade * 365;

        System.out.println("Olá, " + nome + " e você já viveu: " + tempovida + " dias de vida");

        scanner.close();

    }
}
