import java.util.Scanner;
public class H105 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif sayı gir");
        int n=input.nextInt();
        int s=0;
        int t=0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                t+=i;
                s++;
            }
        }
        if (t%s==0) {
            System.out.println("aritmetik sayı");
        }
        else{
            System.out.println("aritmetik sayı değil");
        }
    }
    
}
