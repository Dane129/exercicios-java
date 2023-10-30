import java.util.Scanner;
public class tresvalores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;

        System.out.println("Diga o valor de A: ");
        A = scanner.nextInt();

        System.out.println("Diga o valor de B: ");
        B = scanner.nextInt();

        System.out.println("Diga o valor de C: ");
        C = scanner.nextInt();

        if ((A+B) < C) {
            System.out.println("O valor de A + B é menor que C");
        }   else {
            System.out.println("O valor de C é menor que A + B");
        }

        scanner.close();
    }
}
