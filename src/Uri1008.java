import java.util.Scanner;
import java.util.Locale;


public class Uri1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idFunc = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salarioFunc;

        salarioFunc = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = "+idFunc);
        System.out.printf("SALARY = U$ %.2f%n",salarioFunc);

        sc.close();

    }

}
