import java.util.Scanner;
public class H93 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir: ");
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println(Math.pow((i*2),(i+1)));
        }
    }
    
}
