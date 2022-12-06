
import java.util.Scanner;
public class H75 {

    public static void main(String[] args) {
        // TODO code application logic here
        double x,n,sonuc;
        Scanner input=new Scanner(System.in);
        System.out.printf("exp(x)=lim(1+x/n)^n\n\n");
        System.out.print("x: "); x=input.nextInt();
        System.out.print("n: "); n=input.nextInt();
        sonuc=Math.pow((1+x/n),n);
        System.out.printf("\nexp(%f)=%f\n",x,sonuc);
    }
    
}
