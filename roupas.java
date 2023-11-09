import java.util.Scanner;
public class roupas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas camisas pequenas?");
        int camisaPequena = scanner.nextInt();

        System.out.println("Quantas camisas médias?");
        int camisaMedia = scanner.nextInt();

        System.out.println("Quantas camisas grandes?");
        int camisaGrande = scanner.nextInt();

        camisaPequena = camisaPequena * 10;
        camisaMedia = camisaMedia * 12;
        camisaGrande = camisaGrande * 15;

        double resultado = camisaPequena + camisaMedia +  camisaGrande;

        System.out.println(resultado);

        scanner.close();
    }
}
