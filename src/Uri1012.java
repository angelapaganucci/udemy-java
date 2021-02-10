import java.util.Scanner;
import java.util.Locale;

public class Uri1012 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;
        double areaTri = ((A*C)/2);
        double areaCir = pi*C*C;
        double areaTra = ((A+B)*C/2);
        double areaQuad = B*B;
        double areaRet = A*B;

        System.out.printf("TRIANGULO: %.3f%n",areaTri);
        System.out.printf("CIRCULO: %.3f%n",areaCir);
        System.out.printf("TRAPEZIO: %.3f%n",areaTra);
        System.out.printf("QUADRADO: %.3f%n",areaQuad);
        System.out.printf("RETANGULO: %.3f%n",areaRet);

        sc.close();



    }

}
