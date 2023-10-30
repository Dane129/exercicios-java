public class forsoma {
    public static void main(String[] args) {
        int soma = 0;

        for (int numero = 1; numero <= 500; numero++) {
            if ((numero % 2 != 0) && (numero % 3 == 0)) {
                soma += numero;
            }
        }

        System.out.println("A soma dos valores ímpares será de: " + soma);
    }
}
