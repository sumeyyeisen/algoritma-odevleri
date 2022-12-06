import java.util.Scanner;
public class H77 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("n gir");
    int n=input.nextInt();
    int t=0;
        for (int i = 0; i <=n-1; i++) {
            t+=Math.pow(-1,i)/Math.pow(((2*i+1)*3), i);
        }
        System.out.println(Math.pow(12, (1/2)*t)); 
    }
    
}