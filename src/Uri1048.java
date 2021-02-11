import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double novoSalario;

        if(salario>0 && salario<=400.00){
            novoSalario = salario*0.15+salario;
        }else if(salario >400.00 && salario <= 800.00) {
            novoSalario = salario * 0.12+salario;
        }else if(salario>800.00 && salario<=1200.00) {
            novoSalario=salario*0.10+salario;
        }else if(salario>1200.00 && salario<=2000.00){
            novoSalario = salario*0.07+salario;
        }else{
            novoSalario=salario*0.04+salario;
        }

        System.out.printf("Novo salario: %.2f%n",novoSalario);

        double reajuste= novoSalario-salario;
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);

        double percentual=(novoSalario-salario)*100/salario;
        System.out.printf("Em percentual: %.0f %%%n",percentual);

    }
}
