public class H98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <=9; j++) {
                for (int k = 0; k <=9; k++) {
                    int s=100*i+10*j+k;
                    if (s==(i*i*i)+(j*j*j)+(k*k*k)) {
                        System.out.println(s);   
                    }                                                             
                }               
            }           
        }
    }    
}