import java.util.Scanner;
public class H95 {

    public static void main(String[] args) {
        int x,y;
        Scanner input=new Scanner(System.in);
        System.out.println("x ve y gir");
        x=input.nextInt();
        y=input.nextInt();
        for (int i = 2; i <=x; i++) {
            for (int j = 2; j <=y; j++) {
                System.out.println(Math.pow(i, j)+Math.pow(j, i));
            }
        }
    }
    
}
