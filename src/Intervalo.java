import java.util.Scanner;
import java.util.Locale;

public class Intervalo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x=sc.nextDouble();

        String intervalo1 = "[0,25]";
        String intervalo2 = "(25,50]";
        String intervalo3 = "(50,75]";
        String intervalo4="(75,100]";

        if(x<=25 && x>=0){
            System.out.println("Intervalo "+intervalo1);
        } else if(x>25 && x<=50){
            System.out.println("Intervalo "+intervalo2);
        } else if(x>50&&x<=75){
            System.out.println("Intervalo "+intervalo3);
        } else if(x>75&&x<=100) {
            System.out.println("Intervalo " + intervalo4);
        } else
            System.out.println("Fora de intervalo");

        sc.close();
    }
}
