import java.util.Scanner;

public class H91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s,t=0;
        Scanner input=new Scanner(System.in);
        System.out.println("tamsayı: ");
        s=input.nextInt();
        for (int i = 1; i < s; i++) if(s%i==0) t+=i;
        if(s==t) System.out.println("mükemmel sayı");
        else System.out.println("mükemmel değil");
        }
    }
    

