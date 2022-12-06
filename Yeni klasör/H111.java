import java.util.Scanner;
public class H111 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif sayı gir");
        int n=input.nextInt();
        int t1=1,t2=1;
        System.out.println(t1+""+t2);
        for (int i = 1; i <n-2; i++) {
            int t3=t1+t2;
            System.out.println(t3);
            t1=t2;
            t2=t3;
        }
    }
    
}
