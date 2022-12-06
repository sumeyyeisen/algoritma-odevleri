import java.util.Scanner;
public class H107 {

 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif sayı gir");
        int n=input.nextInt();
        System.out.println(Math.pow(9*10 , (n-1)/2));
    }
    
}
