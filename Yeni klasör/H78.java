import java.util.Scanner;
public class H78 {


    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("n gir");
    int n=input.nextInt();
    int c=1;
        for (int k =  1 ; k <=n; k++) {
            int c1=4*k*k;
            c*=c1/(c1-1);
        }
        System.out.println(2*c);
    }
    
}
