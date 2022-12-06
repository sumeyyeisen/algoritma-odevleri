import java.util.Scanner;
public class H85 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("a ");
        int a=input.nextInt();
        double b=a/(2+Math.pow(2, 5));
        double c=a-b;
        System.out.println(c+""+b);
    }
    
}
