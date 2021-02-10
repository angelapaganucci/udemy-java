import java.util.Scanner;
import java.util.Locale;


public class Uri1011 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double pi = 3.14159;
        double volume;

        volume = ((4/3.0) * pi * (R*R*R));

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();

    }

}
