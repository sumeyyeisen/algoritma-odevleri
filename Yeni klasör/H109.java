import java.util.Scanner;
public class H109 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif sayı gir");
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            int u=i*(i+1)/2;
            System.out.println(u);
        }
    }    
}