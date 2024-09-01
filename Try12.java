public class Try12 {
    public static void doSomething(int x, int[] ys, Baby b) { 
        x = 99;
        ys[0] = 99;
        b.name = "99"; 
    }
    public static void main(String[] args) {
        int i = 0;
        int[] j = {0};
        Baby k = new Baby("50" , true);
        doSomething(i,j,k);
        System.out.println(i);
        System.out.println(j[0]);
        System.out.println(k.name);
    }

}
