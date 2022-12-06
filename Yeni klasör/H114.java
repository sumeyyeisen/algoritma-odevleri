import java.util.Scanner; 
public class H114 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif sayı gir");
        int n=input.nextInt();
        int f1=1,f2=-1;
        System.out.println(f1+""+f2);
        for (int i = 1; i < n-2; i++) {
            int f3=f1-f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
    
}
