//klavyeden girilen x için , klavyeden girilen terim sayısı kadar seriye açarak  +
import java.util.Scanner;
public class H74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N; double x,T=1,F=1;
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı: ");
        N=input.nextInt();
        System.out.println("x değeri: ");
        x=input.nextInt();
        for (int i = 1; i < N; i++) {
            F*=i;
            T+=Math.pow(x,i)/F;
            
        }
        System.out.printf("\nSeri açılımı ile e üzeri x değeri: %.5f\n",T);
        System.out.printf("komutla e üzeri x değeri: %.5f\n",Math.exp(x));
    }
    
}
