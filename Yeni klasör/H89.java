
import java.util.Scanner;
public class H89 {
    
    public static boolean asalmi (int x){
        for(int i=2; i<x; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
            

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir: ");
        int n=input.nextInt();
        if (asalmi(n)){
            
        }
        }      
}
    

