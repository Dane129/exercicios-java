import java.util.Scanner;
public class distanciaeuclidiana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de x");
        double x1 = scanner.nextDouble();

        System.out.println("Digite o valor de y");
        double y1 = scanner.nextDouble();

        System.out.println("Digite o valor de x");
        double x2 = scanner.nextDouble();

        System.out.println("Digite o valor de y");
        double y2 = scanner.nextDouble();

        double parcial = (x2 - x1);
        double parcial2 = (y2 - y1);

        double elevar = Math.pow(parcial, 2);
        double elevar2 = Math.pow(parcial2, 2);

        double parcial3 = elevar + elevar2;

        double resultado = Math.sqrt(parcial3);

        System.out.println("A distância é: " + resultado);

        scanner.close();
    }
}
