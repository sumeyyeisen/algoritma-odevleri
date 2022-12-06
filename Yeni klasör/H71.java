import java.util.Scanner;
public class H71 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı: ");
        int n=input.nextInt();
        int t=0;
        for (int k = 0; k <= n-1; k++) {
            t=t+1/((2*k+1)*(2*k+2));
            System.out.println("Ln(2) "+t);
            
        }
    }
    
}
