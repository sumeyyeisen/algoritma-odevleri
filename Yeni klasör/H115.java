import java.util.Scanner; 
public class H115 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı gir");
        int n=input.nextInt();
        int t1=1,t2=1,t3=2;
        System.out.println(t1+"/"+t2+"/"+t3);
        for (int i = 1; i < n-3; i++) {
            int t4=t1+t2+t3;
            System.out.println(t4);
            t1=t2;
            t2=t3;
            t3=t4;
        }
    }
    
}
