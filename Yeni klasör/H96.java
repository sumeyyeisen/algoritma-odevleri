import java.util.Scanner;
public class H96 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir: ");
        int n=input.nextInt();
        if((n-1)%4==0){
            System.out.println("hilbert");
        }
        else
            System.out.println("hilbert değil");
    }
    
}
