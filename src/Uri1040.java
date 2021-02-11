import java.util.Scanner;
import java.util.Locale;


public class Uri1040 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        float media = (float) (((N1 * 2) + (N2 * 3) + (N3 * 4) + N4) / 10);

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");

        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            double mediaExame = (media + notaExame) / 2;

            if (mediaExame >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaExame);
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}

