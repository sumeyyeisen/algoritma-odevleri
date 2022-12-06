import java.util.Scanner;
public class H86 {

    
    public static void main(String[] args) {

        int n,s;
        Scanner input=new Scanner(System.in);
        System.out.println("üst sınır gir");
        n=input.nextInt();
        for(int i=2; i<=n; i++){
            s=0;
            for(int j=1; j<=i; j++) if(i%j==0) s++;
            if(s==2) System.out.print(i+"\t"); 
            
        }
    }
    
}
