public class Actions {
    public static void main(String[] args) {
        for ( ; ;){
        int chk;
        Shouhuoji example1 = new Shouhuoji(5, 5);
        example1.init();
        example1.addItem();
        chk = example1.buySomething();
        System.out.println(chk);
        example1.exit();
        }
    }
}
