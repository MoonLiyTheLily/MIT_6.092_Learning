public class BubbleSort {
    public static double[] sort(double[] args) {
        for(int i = 0 ; i < args.length - 1 ; i++ ){
            
            double temp;
            for(int j = 0 ; j < args.length - i - 1 ; j++ ){
                if( args[j] > args [j+1] ){
                    temp = args[j+1];
                    args[j+1] = args[j];
                    args[j] = temp;
                }else{
                    continue;
                }
            }
        }
        return args;
    }
}
/*这里减不减1一样的。因为不减一，i会变成长度减1，下边的长度-i-1就是0，循环结束了。不减一，那么下边那个长度-i-1就是1，循环同样不会开始。*/