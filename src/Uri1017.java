import java.util.Scanner;
import java.util.Locale;


public class Uri1017 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int tempoViagem = sc.nextInt();
        int distanciaPercorrida=sc.nextInt();

        double litros;

        litros = (tempoViagem*distanciaPercorrida)/12.0;

        System.out.printf("%.3f%n", litros);

        sc.close();

    }

}
