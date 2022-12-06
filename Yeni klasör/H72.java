import java.util.Scanner;
public class H72 {

    public static void main(String[] args) {
     // TODO code application logic here
     int BS,tahmin,s=0;
     Scanner input=new Scanner(System.in);
     BS=(int)(Math.random()*98)+1;
     do {
         System.out.println("tahmin: ");
         tahmin=input.nextInt();
         s++;
         if(tahmin>BS) 
             System.out.println("daha küçük gir");
         if(tahmin<BS)
             System.out.println("daha büyük gir");
         System.out.println("");
     }
     while(tahmin!=BS);
         System.out.println(s+"tahminde bulundunuz");
    }
    
    }
