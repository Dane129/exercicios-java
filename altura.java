public class altura {
    public static void main(String[] args) {
        double[] altura = {1.40, 1.50, 1.60, 1.70, 1.80, 1.69, 1.85, 1.52, 1.65};

        double alturamaxima = altura[0];
        double alturaminima = altura[0];

        for (int i = 1; i < altura.length; i++) {
            if (altura[i] < alturaminima) {
                alturaminima = altura[i];
            }   else if (altura[i] > alturamaxima) {
                alturamaxima = altura[i];
            }
        }

        System.out.println("A menor altura é: " + alturaminima);
        System.out.println("A maior altura é: " + alturamaxima);
    }
}
