import java.util.Scanner; 
public class H116 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("büyük değerli fibonacci sayısı gir");
        double n=input.nextInt();
        double ao=(1+Math.pow(5,0.5));
        double f1=n/ao;
        double f3=n*ao;
        System.out.println(f1+"/"+n+"/"+f3);
    }
    
}
