/*klavyeden girilen pozitif tam sayının chen asalı olup olmadığını test et (chen asalı: girilen asal sayının 2 fazlasının da asal olması)
*
* 1: kullanıcıdan n sayısı al
* 2: eğer n



*/
import java.util.Scanner;
public class Homework1 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("n gir");
    int n=input.nextInt();
    int j=n+2;
    boolean asalmi = true;
    boolean chenmi = true;
    for(int i=2 ; i<=n ; i++){
        if(n%i==0){
            asalmi = false;
        }   
    }
    if(asalmi=true && n!=1){
        for(int k=4 ; k<=j ; k++){
            if(j%k==0){
                chenmi = false;
            }
        }
        }
    if(chenmi=true && j!=3){
        System.out.println("sayı chen asalıdır");
    }
    else{
        System.out.println("sayı chen asalı değildir");
    }
        
    }
    }  
           
