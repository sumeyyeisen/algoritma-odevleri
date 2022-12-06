import java.util.Scanner;
public class H84 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("a ");
        int a=input.nextInt();
        double b=(double)a*(1+Math.pow(5,0.5))/2;
        System.out.println(""+a+b+b);
                
    }
    
}
