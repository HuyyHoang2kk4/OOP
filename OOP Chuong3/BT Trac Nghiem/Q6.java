public class Q6 {
    public static void main(String[] args) {
        int i = 4;         
        float f = 4.3f;    
        double d = 1.3;     
        int c = 0;          

        if (i == f) {      
            c++;            
        }

        if ((int)(f + d) == ((int) f + (int) d)) { 
            c++;            
        }

        System.out.println(c); 
    }
}
