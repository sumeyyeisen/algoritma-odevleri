import java.util.Scanner;
public class H97 {

    public static void main(String[] args) {
  
        Scanner input=new Scanner(System.in);
        System.out.println("a ve b gir");
        int a=input.nextInt();
        int b=input.nextInt();
        int ta=0;
        int tb=0;
        for (int i = 1; i <=a-1; i++) {
            if(a%i==0){
                ta+=i;
            }
        }
        for (int i = 1; i <=b-1; i++) {
            if(b%i==0){
                tb+=i;
            }
        }
        if(ta==b && tb==a){
            System.out.println("dost");
        }
        else
            System.out.println("dost değil");
        
    }
    
}
