import java.util.Scanner;
import java.util.Locale;

public class Uri1038 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codItem=sc.nextInt();
        int quantidadeItem = sc.nextInt();

        double total;

        if(codItem==1){
            total = quantidadeItem*4.0;
        }else if(codItem==2){
            total = quantidadeItem*4.5;
        }else if(codItem==3){
            total=quantidadeItem*5.0;
        }else if(codItem == 4){
            total=quantidadeItem*2.0;
        }else
            total=quantidadeItem*1.5;

        System.out.printf("Total: R$ %.2f%n",total);

        sc.close();

    }

}
