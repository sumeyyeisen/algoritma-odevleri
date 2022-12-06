import java.util.Scanner; 
public class H121 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı gir");
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            int t=0,f=1;
            for (int j = 1; j <=100; j++) {
                f*=j;
                t+=Math.pow(j, i)/f;
                
            }
            System.out.println(t/2.7182818);
        }
        
    }
    
}
