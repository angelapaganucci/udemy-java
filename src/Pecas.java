import java.util.Scanner;
import java.util.Locale;

public class Pecas {

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int codPeca1 = sc.nextInt();
            int qtadePecas1 = sc.nextInt();
            double valorPeca1 = sc.nextDouble();
            int codPeca2 = sc.nextInt();
            int qtadePecas2 = sc.nextInt();
            double valorPeca2 = sc.nextDouble();
            double valorTotal;

            valorTotal =((qtadePecas1*valorPeca1)+(qtadePecas2*valorPeca2));

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorTotal);

        sc.close();

        }
    }
