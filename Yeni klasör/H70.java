import java.util.Scanner;
public class H70 {

    
    public static void main(String[] args) {
        int N,is; double aci,X,F,T=0;
        Scanner input=new Scanner(System.in);
        System.out.println("açı derecesi: ");
        aci=input.nextDouble();
        System.out.println("terim sayısı; ");
        N=input.nextInt();
        X=Math.toRadians(aci);
        is=1;
        for (int i = 1; i <= N ; i++) {
            F=1;
            for (int j = 1; j <= 2*i-1; j++) 
                F*=j;
                is*=(-1);
                T+=is*Math.pow(X, (2*i-1))/F; }
                System.out.printf("\nSeri açılımı ile hesaplanan değer: %.5f\n",T);
                System.out.printf("komutla hesaplanan değer: %.5f\n",Math.sin(X));
    }
    
}
