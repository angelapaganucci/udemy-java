import java.util.Scanner;
import java.util.Locale;

public class Salario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o ID do funcionário:");
        int idFunc = sc.nextInt();
        System.out.println("Digite a a quantidade de horas trabalhadas:");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("Digite o valor da hora:");
        double valorHora = sc.nextDouble();
        double salarioTotal;

        salarioTotal = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + idFunc);
        System.out.printf("SALARY = U$ %.2f%n", salarioTotal);

        sc.close();

    }
}
