import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area;
        double pi = 3.14159;

        area = pi * raio * raio;

        System.out.println("A=" + area);


        sc.close();

    }
}
