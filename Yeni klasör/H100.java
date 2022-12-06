import java.util.Scanner;
public class H100 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir");
        int n=input.nextInt();
        int t=0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                t+=i;
            }
        }
        if(t<2*n){
            System.out.println("eksik sayıdır");
            System.out.println(t<2*n);
        }
        else{
            System.out.println("eksik sayı değil");
        }
    }
    
}
