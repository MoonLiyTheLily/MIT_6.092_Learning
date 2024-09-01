public class Try4 {
    public static void test(int x){
        if (x>5){
            System.out.println("x="+x+",is bigger than 5");
        }else{
            System.out.println("x="+x+"is smaller than 5");
        }
    }
    public static void main(String[] arguments){
        test(4);
        test(5);
        test(6);
    }
}
