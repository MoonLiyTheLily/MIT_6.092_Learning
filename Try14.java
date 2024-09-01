public class Try14 {
    public static void main(String[] args) {
        Baby2 b2 = new Baby2();
        b2.servings = 100;
        b2.feed(b2.servings);
        b2.poop();
        System.out.println("shot");
        System.out.println(b2.servings);

    }
}
