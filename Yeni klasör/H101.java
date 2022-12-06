import java.util.Scanner;
public class H101 {

    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
    System.out.println("üst sınır gir: ");
    int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            int s=0;
            for (int j = 1; j <=i; j++) {
                if (i%j==0) {
                    s++;
                }
                if(i%s==0)
                    System.out.println(i);
            }
        }
    }
    
}
