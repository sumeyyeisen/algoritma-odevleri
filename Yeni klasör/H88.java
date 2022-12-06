import java.util.Scanner;
public class H88 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int x,y=2;
        System.out.println("sayı gir: ");
        x=input.nextInt();
        while(x>1)
            if(x%y==0){
                System.out.printf("%d\t",y);
                x/=y;
            }
            else y++;
        
    }
    
}
