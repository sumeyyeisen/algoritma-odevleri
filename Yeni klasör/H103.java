import java.util.Scanner;
public class H103 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif sayı gir");
        int n=input.nextInt();
        int s=0;
        int t=0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                s++;
                t+=1/(double)i;
            }
        }
        if(s%t==0){
            System.out.println("ore sayısı");
        }
        else{
            System.out.println("ore sayısı değil");
        }       
    }    
}