
public class Try10 {
    public static void main(String[] args) {
        double[] EXAMPLE = {1.0 , 0.0 };
        BubbleSort.sort(EXAMPLE);
        for (int i = 0 ; i < EXAMPLE.length ; i++){
            int j = i + 1;
            System.out.println("example No." + j + " is " + EXAMPLE[ i ]);
        }
    }
}