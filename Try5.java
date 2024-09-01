public class Try5 {
    public static void main(String[] args) {
        int i=0;
        while (i<4) {
            if(i==2){
                i++;
                continue;
            }
            System.out.println("i="+i);
            i++;
        }
    }
}
