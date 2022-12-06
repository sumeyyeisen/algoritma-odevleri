import java.util.Scanner;
public class H76 {


    public static void main(String[] args) {
        
         Scanner input=new Scanner(System.in);
         System.out.println("N gir: ");
         int N=input.nextInt();
         double toplam=0;
         for (int k = 0; k <= N; k++) {
            double fakt=1;
            int temp=2*k+1;
            for (int i = 1; i <=temp; i++) {
                fakt*=i;
        }
            toplam+=(double)(temp+1)/ fakt;
    }
         System.out.println(toplam);
    
}}
