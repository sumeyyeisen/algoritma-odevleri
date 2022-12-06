import java.util.Scanner;
public class H80 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double t=1;
        System.out.print("bölüm sayısı"); int n=input.nextInt();
        for(int i=0;i<n;i++) t=2+1/t;
        System.out.printf("karekök(2)=%f\n",1+1/t);
    }
    
}
