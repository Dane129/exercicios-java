import java.util.Scanner;
public class cavalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos cavalos deseja comprar? ");
        int cavalos = scanner.nextInt();

        int soma = cavalos * 4;

        System.out.println("Você precisará comprar " + soma + " ferraduras.");

        scanner.close();
    }
}
