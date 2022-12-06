import java.util.Scanner;
public class H99 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("a ve b gir ");
        int a=input.nextInt();
        int b=input.nextInt();
        int a0=a%10;
        int b0=b%10;
        int a1=a/10;
        int b1=b/10;
        if ((a1==b1)&&(a0+b0==10)) {
            System.out.println("bağdaşık sayı");
        }
        else{
            System.out.println("bağdaşık değil");
        }
    }
    
}
