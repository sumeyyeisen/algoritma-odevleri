import java.util.Scanner;
public class H83 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ab ");
        double ab=input.nextDouble();
        double cb=2*ab/(1+Math.pow(5,0.5));
        double ac=ab-cb;
        System.out.println(ac);
        System.out.println(cb);
        
    }
    
}
