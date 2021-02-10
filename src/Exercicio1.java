import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x;
        double y;
        String a;
        char c;

        System.out.println("Digite um número inteiro: ");
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);

        System.out.println("Digite um número decimal:");
        y = sc.nextDouble();
        System.out.println("Você digitou: " + y);

        System.out.println("Digite uma palavra: ");
        a = sc.next();
        System.out.println("Você digitou: " + a);

        c = sc.next().charAt(0);
        System.out.println("Você digitou: " + c);


        sc.close();

    }
}

