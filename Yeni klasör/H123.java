import java.util.Scanner;
public class H123 {
    public static double fakt(int b){
        int a=1;
        for (int i = 1; i <=b; i++) {
            a*=i;
        }
        return a;
    }
    public static double comb(int x,int y){
         return fakt(x)/fakt(y)*fakt(x-y);
    }
    public static double s(int n,int k){
        double t=0;
        for (int i = 0; i <=k; i++) {
            t+=Math.pow(-1, 1)*comb(k,1)*Math.pow(k-1, n);
        }
        return t*1/fakt(k);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("n 1 gir");
        int n=input.nextInt();
        int t=0;
        for (int i = 1; i <=n; i++) {
            t+=s(n,1);
        }
        System.out.println(t);
    }
    
}
