public class Try6 {
    public static void main(String[] args) {
        for ( int i=0 ; i<3 ; i++){
            for ( int j=2 ; j<4 ; j++){
                System.out.println(i+""+j);
            }
        }
        j=i;//变量作用域
    }
}
