import java.util.Scanner;
public class estadocivil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scanner.next();

        System.out.println("Com que gênero se identifica? F ou M ");
        String genero = scanner.next();

        System.out.println("Estado civil? ");
        String civil = scanner.next();

        if (genero.equals("F") && civil.equals("Casada")) {
            System.out.println("A quanto tempo está casada? ");
            String casada = scanner.next();
            System.out.println("Está casada a: " + casada + " anos");
        }
        scanner.close();
    }
}
