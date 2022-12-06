import java.util.Scanner;
public class H94 {

  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir: ");
        int n=input.nextInt();
        for (int i = 0; i <=n-1; i++) {
            System.out.println(Math.pow(2,Math.pow(2,i))+1);
        }
    }    
}
