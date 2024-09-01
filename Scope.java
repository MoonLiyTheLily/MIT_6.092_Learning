public class Scope {
    public static void main(String[] arguments){
        int x=5;
        if(x==5){
            int x=6;
            int y=72;
            System.out.println("x="+x+"y="+y);
        }
        System.out.println("x="+x+"y="+y);
    }
}
//这是个错误的代码示例，有两个地方错了。第一：重复定义了x，第二，在if的{}这个括号里定义了y，但是main方法里没定义，会错误。