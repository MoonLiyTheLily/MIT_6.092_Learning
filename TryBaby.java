public class TryBaby {
    public static void main(String[] args) {
        Baby mark = new Baby("mark", true);
        System.out.println(mark.poopCounter);
        System.out.println(mark.isMale);
        mark.poop();
        System.out.println(mark.poopCounter);
    }
}
