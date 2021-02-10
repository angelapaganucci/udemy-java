import java.util.Scanner;
import java.util.Locale;


public class Uri1009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeVendedor=sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        double salarioTotal;

        salarioTotal = (totalVendas * 0.15)+salarioFixo;

        System.out.printf("TOTAL = R$ %.2f%n",salarioTotal);

        sc.close();

    }

}