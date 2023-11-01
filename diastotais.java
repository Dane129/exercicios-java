import java.util.Scanner;

public class diastotais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia: ");
        int dias = scanner.nextInt();

        System.out.println("Digite um mês: ");
        int mes = scanner.nextInt();

        int resultado = ((mes*30) - dias);

        System.out.println("O total de dias que se passou até agora é: " + resultado);

        scanner.close();
    }
}
