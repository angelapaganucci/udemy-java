import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int total;

        total = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + total);

        sc.close();

    }
}
