public class Q5 {
    int a, b;

    public void f() {
        a = b = 0; 
        int[] c = {0}; 
        g(b, c); 
        System.out.println(a + " " + b + " " + c[0]);
    }

    public void g(int b, int[] c) {
        a = b = 1; 
        c[0] = 1; 
    }

    public static void main(String[] args) {
        Q5 e = new Q5(); 
        e.f(); 
    }
}
