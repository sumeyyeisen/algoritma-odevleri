
import java.util.Scanner;


public class H81 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double t=1;
        System.out.print("bölüm sayısı"); int n=input.nextInt();
        for(int i=0;i<n-1;i++) t=1+1/(2+1/t);
        System.out.printf("karekök(3)=%f\n",1+1/t);
    }
    
}
