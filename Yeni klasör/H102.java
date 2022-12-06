import java.util.Scanner;
public class H102 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("adet gir ");
    int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println(i+""+i+1+""+i*(i+1));
        }
    }
    
}
