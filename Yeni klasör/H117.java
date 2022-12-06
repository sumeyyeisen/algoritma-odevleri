import java.util.Scanner; 
public class H117 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı gir");
        int n=input.nextInt();
        for (int k = 0; k <=n-1; k++) 
        {
            double a1=Math.pow(1+Math.sqrt(2), k);
            double a2=Math.pow(1-Math.sqrt(2),k);
            double a3=2*Math.sqrt(2);
            System.out.println((a1-a2)/a3);
        }
    }
    
}
