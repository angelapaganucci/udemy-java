import java.util.Scanner;


public class Uri1013 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maiorAB;
        int maiorBC;

        maiorAB = (a+b+Math.abs(a-b))/2;
        maiorBC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.print(maiorBC +" eh o maior\n");

        sc.close();

    }

}
